import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class BasicMathQuiz {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        Random rand = new Random();
        int points = 0;
        double answer=0.0;
        double input=0.0;

        //loop 10 times
        for(int i=0;i<10;i++){
            //generate a math expression
            int num1 = (int)(Math.random()*100); // random decimal(0-1)*100 casted to int, bassically 0-100
            int num2 = rand.nextInt(100)+1; // 1-100
            int signNum = rand.nextInt(4); //0-3
            if(signNum==0){
                System.out.printf("what is %d / %d: ",num1,num2);
                answer = (double)num1/num2;
            }
            else if(signNum==1){
                System.out.printf("what is %d * %d: ",num1,num2);
                answer = (double)num1*num2;
            }
            else if(signNum==2){
                System.out.printf("what is %d + %d: ",num1,num2);
                answer = (double)num1+num2;
            }
            else{
                System.out.printf("what is %d - %d: ",num1,num2);
                answer = (double)num1-num2;
            }
            input = ui.nextDouble();
            if(input==answer){
                System.out.println("Good job!");
                points++;
            }
            else{
                System.out.printf("Stop being stupid! The answer was %f\n",answer);
            }
        }
        //check to see if the user answered the expression correctly
        
        //output their points
        System.out.printf("Your total points were %d/10",points);
    }
}
