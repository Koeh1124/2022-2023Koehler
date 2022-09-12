public class StringNotes{
    public static void main(String[] args) {
        //literal string statement
        String name = "bob";
        //class assigment or constructor
        String name2 = new String("bob");
        //we know the sting is a class because it is capital and has a new unlike int
        int age = 0;
        String ages=new String("0");
        System.out.println(name+ages);
        System.out.println(name.concat(ages));
        System.out.printf("%s,%s",name,ages);

        /*
         * main methods:
         * substring() = return a section of a string 
         * indexof() = returns index of char in a string  (first instance)
         * equals() = strings cant use ==
         * length() = returns length of string
         * contains() = returns bool if it contains
         */

        String email = new String("nate.adam@bbobaboom.g0v");

        //length of our string
        System.out.println(email.length()); // prints the # of chars in the email

        //print out the username
        System.out.println(email.substring(0,email.indexOf("@")));

        //whber is the @ sign at???
        System.out.println(email.indexOf("@"));

        //see if new email is the same as old email
        String newEmail = new String("keenan.mason@email.kb");
        System.out.println(email.equals(newEmail));
    }
}