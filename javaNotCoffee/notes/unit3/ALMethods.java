import java.util.ArrayList;

import javax.print.DocFlavor.INPUT_STREAM;

import java.lang.Math;
public class ALMethods {
    public static void main(String[] args) {
        // 1,5,9,7,4,8,2,3,6,0,9
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        int[] ia = { 1, 5, 9, 7, 4, 8, 2, 3, 6, 0, 9 };
        arrList = createArrayList(ia);
        System.out.println(arrList);
        System.out.println(stdDev(arrList));
    }

    // convert an int array to an int arrayList
    public static ArrayList<Integer> createArrayList(int[] iarr) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < iarr.length; i++) {
            temp.add(iarr[i]);
        }
        return temp;
    }
    public static int aveIntAL(ArrayList<Integer> arrList){
        int total = 0;
        for(int i = 0;i<arrList.size();i++){
            total+=arrList.get(i);
        }
        return (total/arrList.size());
    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> al) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i =0; i<al.size(); i++) {
            if (!arrList.contains(al.get(i))) {
                arrList.add(al.get(i));
            }
        }

        return arrList;
    }
    public static int maxIntAL(ArrayList<Integer> al) {
        int max = Integer.MIN_VALUE;
        
        for (int i =0; i < al.size(); i++) {
            if (max < al.get(i)) {
                max = al.get(i);
            }
        }

        return max;
    }
    public static int minIntAL(ArrayList<Integer> al) {
        int min = Integer.MAX_VALUE;
        
        for (int i =0; i < al.size(); i++) {
            if (min > al.get(i)) {
                min = al.get(i);
            }
        }

        return max;
    }
    public static int stdDev(ArrayList<Integer> arrList){
        int totalDev = 0;
        int mean = aveIntAL(arrList);
        for(int i = 0;i<arrList.size();i++){
            totalDev = (int)Math.pow(arrList.get(i)-mean, 2);
        }
        return (int)Math.sqrt(totalDev/arrList.size());
    }
    public static int count(ArrayList<Integer> arrList, int item){
        int count = 0;
        for(int i=0;i<arrList.size();i++){
            if(item == arrList.get(i)){
                count+=1;
            }
        } 
        return count;
    }
    public static int mode(ArrayList<Integer> temp){
        //find highest frequency number
        ArrayList<Integer> uniqueList = new ArrayList<>();
        //find the unique values...
        uniqueList=removeDuplicates(temp);
        ArrayList<Integer> counList = new ArrayList<>();
        //create a list of 0's the will map to unique List
        //countList=createArrayList(new int[uniqueList.size()]);
        //for each loop
        for(int n: uniqueList){
            counList.add(0);
        }

        //iterate through the uniqueList and count the frequency
        for(int n:uniqueList){
            int c = count(temp, n);
            counList.set(uniqueList.indexOf(n), c);
        }

        //find the max value in the countList
        int modeValue = maxIntAL(countList);

        //set mode to the highest value of uniqueList[countList]
        int mode = uniqueList.get(countList.get(modeValue));

        return mode;
    }
}