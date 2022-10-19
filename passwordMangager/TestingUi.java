public class TestingUi {
    public static void main(String[] args) {
        Password pass = new Password("bruh");
        System.out.println(pass.toString());
        for(int i = 0;i<5;i++){
            pass.genPassword();
            System.out.println(pass.toString());
        }
    }
}
