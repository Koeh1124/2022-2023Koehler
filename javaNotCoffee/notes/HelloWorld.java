//This is the main class that you are running
//public = so the jvm can acess the file
// class = define that the following code is in a class together
// classname must have the fist letter capatilized 
// and same as the file name
// and numbers must be at the end of the classs if you want to put numbers in there :)
public class HelloWorld {
    //comment
    /*multi
     * line
     * comment
     */
    //if this is where the programm starts, you need the following method
    public static void main(String[] args){ 
        System.out.println("hello world");    //the ; is the period of programming (the end of the statement)
        System.out.print("Howdy"); // still works but println gives a /n at the end
        System.out.println(" still on the same line"); // still works but println gives a /n at the end
        System.out.println(12345.6789);
        System.out.printf("%2.2f%n",12345.6789);
        System.out.printf("%5.2f%n",12345.6789);
        System.out.printf("%10.2f%n",12345.6789);
    }
}

/*
 * Delete entire line - shift del
 * delete entre word = ctrl + del
 * Highlight words = ctrl+shift"arrowkey
 * Reformat = ctrl + a then ctrl+k then ctrl +f
 * delete entife file... del system32 :)
 */