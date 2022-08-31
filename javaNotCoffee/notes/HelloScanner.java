import java.util.Scanner;

public class HelloScanner {
    public static void main(String[] args){
        //py - input("message") - input a string
        //classname objname = new classconstructor(peram for obj);
        Scanner ui = new Scanner(System.in); // this is an object called ui that we can now take input with :)
        System.out.println("Question, what is your name?");
        String name = ui.nextLine();
        System.out.println("Hello "+name);
        //good practice but not required
        ui.close();
    }
}