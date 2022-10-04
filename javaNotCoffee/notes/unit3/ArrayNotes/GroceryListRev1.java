import java.util.Scanner;

public class GroceryListRev1 {
    public static void main(String[] args) {
        //build a grocery list
        Scanner ui = new Scanner(System.in);
        System.out.print("How many? ");
        int howMany = ui.nextInt();
        System.out.println();
        //String[] groceryList = {}; not good len 0
        GroceryItem[] groceryList = new GroceryItem[howMany];
        for(int i=0;i<groceryList.length;i++){
            System.out.print("name:");
            String name = ui.next();
            System.out.print("cost:");
            double cost = ui.nextDouble();
            groceryList[i] = new GroceryItem(name,cost);
        }
        ArrayNotes.printArray(groceryList);
    }
}
