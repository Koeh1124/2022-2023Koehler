import java.util.Scanner;

public class RPS {
    public static void main(String[] args){
        //u1 inputs r,p,s
        //u2 inputs r,p,s
        Scanner ui = new Scanner(System.in);
        System.out.println("input 'r','p','s' for rock,papper,sisors");
        System.out.print("User 1: ");
        String u1 = ui.nextLine();
        System.out.print("User 2: ");
        String u2 = ui.nextLine();
        int winner = 0;
        //u1 r
        if (u1 == "r"){
            if (u2 == "r"){winner=0;}
            else if (u2 == "p"){winner=2;}
            else if (u2 == "s"){winner=1;}
        }
        //u1 p
        if (u1 == "p"){
            if (u2 == "r"){winner=1;}
            else if (u2 == "p"){winner=0;}
            else if (u2 == "s"){winner=2;}
        }
        //u1 s
        if (u1 == "s"){
            if (u2 == "r"){winner=2;}
            else if (u2 == "p"){winner=1;}
            else if (u2 == "s"){winner=0;}
        }

        if (winner == 1){
            System.out.println("User 1 won!");
        }
        else if (winner == 2){
            System.out.println("User 2 won!");
        }
        else{
            System.out.println("It's a tie!");
        }
        System.out.println(u1);
        System.out.println(u2);

    }
}
