import java.util.Scanner;

public class GpaCalc{
    public static void main(String[] args) {
        gpaCalculator();
    }
    public static void gpaCalculator() {
        Scanner ui = new Scanner(System.in);
        int[] grades = new int[5];
        System.out.println("Put grades in 4.0 format F-0, D-1, C-2, B-3, A-4");
        for(int i = 0;i<grades.length;i++){
            System.out.printf("Grade #%d: ",i+1);
            int grade = ui.nextInt();
            grades[i] = grade;
        }
        System.out.printf("Your GPA: %.2f",advList(grades));
        ui.close();
    }
    public static double advList(int[] arr) {
        int n = arr.length;
        double total = 0;
        for(int i = 0;i<arr.length;i++){
            total+=arr[i];
        }
        return total/n;
    }
}