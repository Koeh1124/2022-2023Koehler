import java.util.Scanner;

public class FunctionPractice{
    public static void main(String[] args){
        addTwoNumbers();
    }

    private static void addTwoNumbers(){
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter num1: ");
        double num1 = ui.nextDouble();
        System.out.print("Enter num2: ");
        double num2 = ui.nextDouble();
        double sum = num1+num2;
        System.out.printf("sum: %f",sum);
        ui.close();
    }
}