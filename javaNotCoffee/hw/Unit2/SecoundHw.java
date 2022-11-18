import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

import java.lang.Math;

class SecoundHw {
    public static void main(String[] args) {
        triangleArea(); // done
        midPointTable(); // done
        minuteYearConverter(); // done
        triangleVolume(); // done
    }

    public static void triangleArea() {
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter coordinates of three points seperated by spaces like x1 y1 x2 y2 x3 y3: ");
        String rawInput = ui.nextLine();
        String[] stringArr = rawInput.split(" ", 0);
        double[] numArr = new double[6];
        for (int i = 0; i < 6; i++) {
            numArr[i] = Double.parseDouble(stringArr[i]);
        }
        double s1 = distance(numArr[0], numArr[1], numArr[2], numArr[3]);
        double s2 = distance(numArr[2], numArr[3], numArr[4], numArr[5]);
        double s3 = distance(numArr[4], numArr[5], numArr[0], numArr[1]);
        double s = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        System.out.printf("The area of the triangle is %.1f\n", area);
    }

    public static void midPointTable() {
        System.out.print("a\tb\tMid-Point\n");
        findMidPoint(0, 0, 2, 1);
        findMidPoint(1, 4, 4, 2);
        findMidPoint(2, 7, 6, 3);
        findMidPoint(3, 9, 10, 5);
        findMidPoint(4, 11, 12, 7);
    }

    private static void minuteYearConverter() {
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter the number of minuter: ");
        int minutes = ui.nextInt();
        int days = minutes / (60 * 24);
        int remainingDays = days % 365;
        int years = days / 365;
        System.out.printf("%d minutes is approximately %d years and %d days\n", minutes, years, remainingDays);
        ui.close();
    }

    public static void triangleVolume() {
        Scanner ui = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double sideLength = ui.nextDouble();
        double s = Math.pow(sideLength, 2);
        double area = (Math.sqrt(3) / 4) * s;
        double volume = area * sideLength;
        System.out.printf("The area is %.2f\nThe volume of the Triangular prism is %.2f", area, volume);
        ui.close();
    }

    public static void findMidPoint(int x1, int y1, int x2, int y2) {
        double midx = (x2 + x1) / 2.0;
        double midy = (y2 + y1) / 2.0;
        System.out.printf("(%d,%d)\t(%d,%d)\t(%.1f,%.1f)\n", x1, y1, x2, y2, midx, midy);
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}