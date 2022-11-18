import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferTest {
    public static void main(String[] args) {
        //read in the file and print it to the consle
        BufferWriter.writeString("hello World!");
        BufferWriter.writeString("hello World!");
        BufferWriter.writeString("hello World!");
        BufferWriter.saveAndClose();
        System.out.println(BufferWriter.readString());
    }
}