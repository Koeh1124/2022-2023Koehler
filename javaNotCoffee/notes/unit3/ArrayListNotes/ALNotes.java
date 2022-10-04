import java.util.ArrayList;
import java.util.Scanner;

public class ALNotes{
    public static void main(String[] args) {
        
        //ArrayList newList1 = new ArrayList<>();
        //class<data type> ObjName = new Constructor<DataType>()
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //add
        names.add("Adam");
        names.add("Caden");
        names.add("Nate");
        names.add("Landon");

        //Insert
        names.add(2,"Rome");

        //Remove
        names.remove("Caden");

        //size
        //System.out.println(names.size());

        //get
        //System.out.println(names.get(2));

        //CRUD - Create Read Update Delete

        //System.out.println(names);
        //Clear
        names.clear();
        //System.out.println(names);
        additionCalculator();
    }

    public static void additionCalculator() {
        //take in input untill they type 0
        Scanner ui = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();
        double input = 1;
        double total = 0;
            //output the sum and nubersn they entered
            System.out.print("Enter number to add: ");
                input = ui.nextDouble();
            while(input != 0){
                numbers.add(input);
                total += input;
                System.out.print("Enter number to add: ");
                input = ui.nextDouble();
            }
            
            for(int i = 0;i<numbers.size();i++){
                System.out.print(numbers.get(i)+" ");
            }
            System.out.printf("\nTotal %f\n",total);
    }
}