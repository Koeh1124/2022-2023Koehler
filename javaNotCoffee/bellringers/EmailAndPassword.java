import java.util.Scanner;
public class EmailAndPassword {
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);
        System.out.print("Email: ");
        String email = ui.nextLine();
        System.out.print("Password: ");
        String password = ui.nextLine();
        // System.out.println("Email: "+email);
        // System.out.println("Password: "+password);
        System.out.printf("Email: %s\nPassword: %s",email,password);
    }
}