import java.util.Scanner;

public class LoopityLoop {
    public static void main(String[] args){
        /*while (bool){
            do stuff
        }
        */
        // while (true){
        //     System.out.println("Hello");
        // }

        //print out the numbers 1-10
        int i = 0;
        //while loops are just recursive conditional statements
        //keeps happening untill a condition is meet
        while(i<=9){
            System.out.print(i);
            i++;
            if(i<=9){
                System.out.print(",");
            }
        }
        System.out.println();
        //print 0-9 in a for loop
        //for(var;bool;step){do stuff}
        for (int j=0;j<=9;j++){
            System.out.print(j);
            if(j<9){
                System.out.print(",");
            }
        }
        System.out.println();
        //create a f(x) that takes in pos ints
        //when they type -1 they print min and max values
        minMaxChecker();
    }
    private static void minMaxChecker(){
        Scanner ui = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int current = 0;
        while(current != -1){
            System.out.print("Input positive int (put -1 to stop): ");
            current = ui.nextInt();
            if(max<current && current!=-1){
                max = current;
            }
            if(min>current && current!=-1){
                min = current;
            }
        }
        System.out.printf("Max: %d\nMin: %d",max,min);
    }
}
