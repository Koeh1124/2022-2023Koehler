import java.util.Scanner;

public class Credentis {
    public static void main(String[] args){
        String adminUser = "admin";
        String adminPass = "admin";
        Scanner ui = new Scanner(System.in);
        System.out.print("un: ");
        String user = ui.nextLine();
        System.out.print("pw: ");
        String pass = ui.nextLine();
        if (user.equals(adminUser) && pass.equals(adminPass)){
            System.out.printf("Welcome %s",user);
        }
        else{
            System.out.print("wrong credentials");
        }
    }
}
