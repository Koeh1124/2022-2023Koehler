public class ArrayAlgos{
    public static void main(String[] args) {
         double[] test = {12,7,13,8,4.0,3,72};
         double[] test2 = {120,57,1.3,8.5,0,3,7};
         
         //System.out.println("Sum: %f",sum(test));       
         //System.out.println("Ave: %f",ave(test));
         //System.out.println("Min: %f",min(test));
         //System.out.println("Max: %f",max(test));
         
         //returns the index if found, if not, -1
         //System.out.println("Find: %f",find(test,8));
         //System.out.println("Reverse: "+printArray(reverse(test)));
         System.out.println("Sorted: ");
         printArray(sort(test));
         //System.out.println("Merge: "+printArray(merge(test,test2)));
    }
    public static double ave(double[] arr) {
        int n = arr.length;
        double total = 0;
        for(int i = 0;i<arr.length;i++){
            total+=arr[i];
        }
        return total/n;
    }
    public static double[] sort(double[] arr){
        double[] newArr = new double[arr.length];
        for(int i = 0;i<arr.length;i++){
            double checkVal = arr[i];
            boolean sorted = false;
            System.out.println(checkVal);
            for(int j = 0;j<newArr.length-1;j++){
                if((j==0&&newArr[j]>=checkVal)&&!sorted){
                    System.out.println("lowest");
                    newArr = insert(newArr, j, checkVal);
                    printArray(newArr);
                    sorted = true;
                }
                else if((newArr[j]<=checkVal&&checkVal<newArr[j])&&!sorted){
                    System.out.println("insert at "+j);
                    newArr = insert(newArr, j, checkVal);
                    printArray(newArr);
                    sorted = true;
                }
            }
        }
        return newArr;
    }
    public static double[] insert(double[] arr,int index,double val){
        System.out.println("sorting");
        double[] newArr = new double[arr.length];
        for(int i = 0;i<index;i++){
            newArr[i] = arr[i];
        }
        System.out.println("copied first half");
            printArray(newArr);
        newArr[index] = val;
        System.out.println("inserted");
            printArray(newArr);
        for(int i = index+1;i<arr.length;i++){
            newArr[i] = arr[i-1];
        }
        System.out.println("done");
        printArray(newArr);
        return newArr;
    }
    public static void printArray(double[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}