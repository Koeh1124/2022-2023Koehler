public class TestingUi {
    public static void main(String[] args) {
        Password pass = new Password("bruh");
        Account acc1 = new Account("Netflix", "MyUser");
        Account acc2 = new Account("Hulu", "MyOtherUser", pass);
        Account acc3 = new Account("Disney+", "User3", "H8%bvnj7");
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());
        Password pass2 = acc3.getPassword();
        System.out.println(pass2.isStrong());
    }
}
