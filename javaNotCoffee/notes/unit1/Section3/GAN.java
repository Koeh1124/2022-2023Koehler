import java.util.Scanner;

public class GAN {
    public static void main(String[] args){
        //guess a number!
        int sn = 7;
        //ask user for num between 0-10
        Scanner ui = new Scanner(System.in);
        System.out.print("Guess the secret number: ");
        int guess = ui.nextInt();
        //if num == secret num
        //print("You win!")
        if (guess==sn){
            System.out.println("You win!");
        }
        //else if num < sn
        //print too low
        else if (guess<sn){
            System.out.println("too low!");
        }
        //else if num > sn
        //print too high
        else if (guess>sn){
            System.out.println("too high!");
        }
        for (int i = 0;i<7;i++){

        }
    }    
}
