public class ArrayNotes{
    public static void main(String[] args) {
        
        //Array -> List... A sequence of data that is not mutable -> dosen't change
        /*Py list
         * listy = []
         * listy=[1,2,3,"four",[1,2,3,4,5],True]
         */

        //data types
        /*Prim
         * -binary
         * -bools
         * -ints
         * -floats
         * -doubles
         * -chars
         * 
         * Non-Prim
         * -String
         * -arrays
         * -dictonary
         * -tuples
         * -objects
         * 
         * Array - List class and ArrayList class
         */

        //datatype[] name = {stuff in here}
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        double[] deciNums = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};

        System.out.println(numbers);
        System.out.println(numbers[1]);
        System.out.println(numbers[1]+4);
        //reset 1 to 5
        numbers[1] = numbers[1]+4;
        System.out.println(numbers[1]);
        System.out.println(deciNums);
        //Py listy.append(data)
        int[] numbersLonger = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(numbersLonger);
        printArray(numbers);
        printArray(deciNums);
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    public static void printArray(double[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void printArray(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void printArray(GroceryItem[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i].toString());
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}