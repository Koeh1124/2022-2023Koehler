import java.util.Scanner;

public class GroceryListRev0 {
    public static void main(String[] args) {
        //build a grocery list
        Scanner ui = new Scanner(System.in);
        System.out.print("How many? ");
        int howMany = ui.nextInt();
        System.out.println();
        //String[] groceryList = {}; not good len 0
        String[] groceryList = new String[howMany];
        for(int i=0;i<groceryList.length;i++){
            System.out.print("Add an item: ");
            groceryList[i]=ui.next();
        }
        ArrayNotes.printArray(groceryList);
    }
}
