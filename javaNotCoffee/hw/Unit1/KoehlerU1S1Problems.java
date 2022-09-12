import java.util.Scanner;
import static java.lang.Math.pow;;

class KoehlerU1S1Problems {
  static Scanner ui = new Scanner(System.in);

  public static void main(String[] args) {
    Boolean running = true;
    while (running) {
      System.out.println("Select which program to run:");
      System.out.println("1:convertMilesToKM");
      System.out.println("2:calculateEngery");
      System.out.println("3:futureInvestments");
      System.out.println("4:drivingCost");
      System.out.println("q:quit");
      String selection = ui.nextLine();
      if (selection.equals("1")) {
        convertMilesToKM();
      } else if (selection.equals("2")) {
        calculateEngery();
      } else if (selection.equals("3")) {
        futureInvestments();
      } else if (selection.equals("4")) {
        drivingCost();
      } else if (selection.equals("q")) {
        running = false;
      } else {
        System.out.println("Invalid entry");
      }
    }
  }

  // https://www.javatpoint.com/java-string-to-double
  // https://stackoverflow.com/questions/14204905/how-to-remove-trailing-zeros-from-a-double
  static void convertMilesToKM() {
    System.out.print("Enter Miles: ");
    int miles = Integer.parseInt(ui.nextLine());
    System.out.printf("%d miles is %.1f kilometers \n", miles, miles * 1.6);
  }

  static void calculateEngery() {
    System.out.print("Enter amount of water in kilograms: ");
    double water = Double.parseDouble(ui.nextLine());
    System.out.print("Enter the inital tempature: ");
    double intTemp = Double.parseDouble(ui.nextLine());
    System.out.print("Enter the final tempature: ");
    double finTemp = Double.parseDouble(ui.nextLine());
    double Q = water * (finTemp - intTemp) * 4184;
    System.out.printf("The engery needed is %.1f \n", Q);
  }

  static void futureInvestments() {
    System.out.print("Enter investment amount: ");
    double intAmt = Double.parseDouble(ui.nextLine());
    System.out.print("Enter annual intrest rate: ");
    double intrestRate = Double.parseDouble(ui.nextLine());
    System.out.print("Enter number of years: ");
    double years = Integer.parseInt(ui.nextLine());
    double total = intAmt * pow((1 + (intrestRate / 100)), (years));
    System.out.printf("Future value is %.2f\n", total);
  }

  static void drivingCost() {
    System.out.print("Enter the driving distance: ");
    double distance = Double.parseDouble(ui.nextLine());
    System.out.print("Enter miles per gallon: ");
    double mpg = Double.parseDouble(ui.nextLine());
    System.out.print("Enter price per gallon: ");
    double ppg = Double.parseDouble(ui.nextLine());
    System.out.printf("The cost of driving is $%.2f\n", (distance / mpg) * ppg);
  }
}