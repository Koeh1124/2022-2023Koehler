import java.lang.Math;
import java.util.Random;
import java.util.random;;
public class JavaMath {
    public static void main(String[] args) {
        /*
        // //int/int == int
        // System.out.println(18/5);
        // //double/int == double
        // System.out.println(18.0/5);
        // //double is a decimal, but is a 64 bit flointing point number
        // System.out.println(18.0/5.0);
        // //long/int
        // System.out.println(30000000/5);
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Double.MAX_VALUE);
        // System.out.println(Long.MAX_VALUE);
        // // System.ot.ptintln("18"+5); big no no
        // //System.out.println(" "*5); Big no no
        // //System.out.println(2**2); Big no no
        // System.out.println(Math.pow(18,5));
        // //makes a double

        // //makes a int
        // System.out.println(6*(2/1)/1);
        // //makes a float
        // System.out.println(6*(2/1.0)/1);
        // //Infiny (7/8) = 0
        // System.out.println(Math.pow(2,3)/(7/7/8));
        // //Eamainder or modulo
        // System.out.println(255%256);

        // //Good rule of thumbs
        // System.out.println(1367/2); // lass precise
        // System.out.println(1367*.5);//more precise
        */
        // int age = 17;
        // double age = 17;
        //no having vars the same names

        double year = 12.5; //data type obj - primitive
        Double years = 12.5;//class type object - non-primitive

        //python increse by 1 +=1
        //python increse by any num +=n

        //java increse by 1 ++
        //java increse by n var+=n;

        /*
         * you can also
         * /=
         * *=
         */
        double randomness = Math.random();
        System.out.println(randomness);

        //random num between 0 and 10
        System.out.println((int) (randomness*10));

        //random num between 42 and 56
        System.out.println((int) (randomness*(56-42))+42);

        //  int randomint = rand.nexInt();

        //  double randDouble = rand.nextDouble();
    }
}