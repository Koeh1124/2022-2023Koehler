import java.util.Random;

public class StringLoops{
    public static void main(String[] args) {
        //Ex. of loops that utilize strings
        //Sequence Data --> Strings, Array, List, ArrayList, LinkedLists, 

        //count the num of char in a string
        howMany("GIGGLING","g");

        //find all \s\s and replace with \s
        spaceReplacer("This sentence.  has.  double spaces.  !");

        //input banana and print bnn
        removeVowels("banana");

        //brute foce a password
        passwordCrack("123456");
    }

    private static void howMany(String s, String v){
        //find the v in s
        int count=0;
        for (int i=0;i<s.length();i++){
            //.substring(beggining,end) == [beginning:end] 
            if(s.toUpperCase().substring(i,i+1).equals(v.toUpperCase())){
                count++;
            }
        }
        System.out.println(count);
    }

    private static void spaceReplacer(String s){
        s = s.replace("\s\s", "\s");
        System.out.println(s);
    }

    private static void removeVowels(String s){
        //aeiou and somtimes y
        s = s.toLowerCase();
        String[] vowlList = {"a","e","i","o","u"};
        for(int i=0;i<vowlList.length-1;i++){
            s = s.replace( vowlList[i], "");
        }
        //make sure the 50% of the time you remove y
        Random rnd = new Random();
        if(rnd.nextBoolean()){
            s = s.replace("y", "");
        }
        System.out.println(s);
    }

    private static void passwordCrack(String p){
        String guess="";
        int count = 0;
        while(!guess.equals(p)){
            count++;
            guess=String.valueOf(count);
        }
        System.out.println("Found it!");
        System.out.println(count);
    }
}