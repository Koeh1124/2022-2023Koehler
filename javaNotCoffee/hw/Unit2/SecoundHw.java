import java.util.Scanner;

class SecoundHw{
    public static void main(String[] args) {
        triangleArea();
        midPointTable();
        minuteYearConverter(); //done
        triangleVolume();
    }
    public static void triangleArea(){
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter coordinates of three points seperated by spaces like x1 y1 x2 y2 x3 y3: ");
        String rawInput = ui.next();

    }
    public static void midPointTable(){
        Scanner ui = new Scanner(System.in);
        System.out.print("");


    }
    private static void minuteYearConverter() {
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter the number of minuter: ");
        int minutes = ui.nextInt();
        int days = minutes/(60*24);
        int remainingDays = days%365;
        int years = days/365;
        System.out.printf("%d minutes is approximately %d years and %d days", minutes,years,remainingDays);
    }
    public static void triangleVolume() {
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        int sideLength = ui.nextInt();
        float s = Math.pow(sideLength*3, 2);
        float area = Math.sqrt(s*(s-sideLength)*3);
        float area = (Math.sqrt(area)
    }
}