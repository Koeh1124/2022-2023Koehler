/*
 * To-DO
 * Password Gen
 * To string
 */
public class Password {
    private String password;
    private boolean strong;

    // constructors
    // one where the user can pass in a password
    // (allowing of not strong passwords, but informing the user of this)
    public Password(String password) {
        this.password = password;
        // check strength and set bool strong to the result
        this.checkStrength();
    }

    // this constrctor we will gen the password for the usser, ensuring it is strong
    public Password() {
        // gen password and set password to the result
        this.genPassword();
    }

    // getters
    public boolean isStrong() {
        return this.strong;
    }

    public String getPassword() {
        return this.password;
    }

    // setters
    public void checkStrength() {
        // check strength and set the strength attr. accordingly
        // a. 1 capital character
        // b. 1 number
        // c. 1 special character (There are only certain special characters allowed)
        password = this.getPassword();
        boolean capital = false;
        boolean num = false;
        boolean special = false;
        // check length
        if (password.length() < 8) {
            // if it's less than 8 we can set to false and end the check
            this.strong = false;
            return;
        }
        for (int i = 0; i < password.length(); i++) {
            Character check = password.charAt(i);
            // check if the char is capital
            if (Character.isUpperCase(check)) {
                capital = true;
            }
            // check if the char is a number
            else if (Character.isDigit(check)) {
                num = true;
            }
            // check if the char is special (not a letter or number)
            else if (!Character.isLetterOrDigit(check)) {
                special = true;
            }
            // if we have found all three we can stop searching
            if (capital && num && special) {
                this.strong = true;
                return;
            }
        }
        // if we haven't ended yet, then it dosen't meet req.
        this.strong = false;
    }

    public void genPassword() {
        // generate password
        this.strong = true;
    }

    public void setPassword(String password) {
        this.password = password;
        this.checkStrength();
    }
}