import java.util.ArrayList;
import java.util.Scanner;

public class Inventory{
    public static void main(String[] args) {
        //manage Inv
        // you can add, insertm remove, replace, clear the db
        // quit --> end the program
        ArrayList<String> iceCreamList = new ArrayList<String>();
        
        Scanner in = new Scanner(System.in);
        String input="";

        while(!input.equals("q")){
            System.out.println(iceCreamList);
            System.out.println("Would you like to (a)dd, (i)nsert, (r)emove, Re(p)lace, (c)lear or (q)uit?");
            input = in.next();
            int index;
            if(input.equals("a")){
                System.out.print("What flavor? ");
                input = in.next();
                iceCreamList.add(input);
            }
            else if(input.equals("i")){
                //insert
                System.out.print("What index? ");
                index = in.nextInt();
                System.out.print("What flavor? ");
                input = in.next();
                if(index<=iceCreamList.size()-1){
                    iceCreamList.add(index,input);
                }
            }
            else if(input.equals("r")){
                //remove
                System.out.print("What index? ");
                index = in.nextInt();
                if(index<=iceCreamList.size()-1){
                    iceCreamList.remove(index);
                }
            }
            else if(input.equals("p")){
                //replace
                System.out.print("What index? ");
                index = in.nextInt();
                System.out.print("What flavor? ");
                input = in.next();
                if(index<=iceCreamList.size()-1){
                    iceCreamList.set(index,input);
                }
            }
            else if(input.equals("c")){
                //clear
                iceCreamList.clear();
            }

        }
    }

}
