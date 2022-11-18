import java.util.Random;

public class passwordGenerator {
    public static void main(String[] args) {
        // generate password
        boolean strong = false;
        String password = "";
        Random rand = new Random();
        while (!strong) {
            int newCharIndex = rand.nextInt(33, 126);
            if (newCharIndex != 92) {
                password = password.concat(String.valueOf((char) newCharIndex));
            }
            strong = checkStrength(password);
        }
        System.out.println(password);
    }

    public static boolean checkStrength(String password) {
        // check strength and set the strength attr. accordingly
        // a. 1 capital character
        // b. 1 number
        // c. 1 special character (There are only certain special characters allowed)
        boolean capital = false;
        boolean num = false;
        boolean special = false;
        // check length
        if (password.length() < 8) {
            // if it's less than 8 we can set to false and end the check
            return false;
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
                return true;
            }
        }
        // if we haven't ended yet, then it dosen't meet req.
        return false;
    }
}
