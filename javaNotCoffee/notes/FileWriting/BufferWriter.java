import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferWriter {
    //write a file
    private static final String Data_File = "mymedia.txt";
    private static Scanner in;
    private static BufferedWriter out;

    public static void writeString(String s) {

        //if out is already created you will be acessing more than one file of the smae name
        if(out==null){
            try{
            out = new BufferedWriter(new FileWriter(Data_File));
            }catch(Exception e){
                System.err.println("Can't open file");
                e.printStackTrace();
            }
        }
        try {
            out.write(s);
            out.newLine();    
        } catch (Exception e) {
            System.err.println("Can't write file");
            e.printStackTrace();
        }
        
    }

    public static void saveAndClose() {
        if(in!=null){
            try {
                in.close();
                //reset obj
                in = null;
            } catch (Exception e) {
                System.err.println("can't close file");
                e.printStackTrace();
            }
        }
        if(out!=null){
            try {
                out.close();
                out = null;
            } catch (Exception e) {
                System.err.println("can't close file");
                e.printStackTrace();
            }
        }
    }

    public static String readString() {
        //if in in null init it
        if(in==null){
            try {
                in = new Scanner(new File(Data_File));
            } catch (Exception e) {
                System.err.println("can't read file");
                e.printStackTrace();
            }
        }
        //read in the vals from the text file
        try {
            //if there is a new line read it in
            if(in.hasNextLine()){
                String s = in.nextLine();
                return s; //grabs Everything
            }
        } catch (Exception e) {
            System.err.println("can't read file");
            e.printStackTrace();
        }
        return null;
    }
}
