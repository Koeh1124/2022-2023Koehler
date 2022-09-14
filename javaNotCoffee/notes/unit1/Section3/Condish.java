public class Condish {
    public static void main(String[] args){
        //condish for bools
        //bool === true or false
        //bool operaters = AND & OR
        //not capatial because they are not a class :)
        /*
         * if(bool){
         *  do
         * }
         * else if(bool){
         *  do
         * }
         * else{
         *  do
         * }
         * 
         * 
         * switch(case):
         *      case:
         *          do
         * 
         */
        int a = 4;
        int b = 4;
        int c = 4;    
        if(a==b){
            System.out.println("They're equal :)");
            }
        else if(a==b && b==c){
            System.out.print("A is === c");
        }
        else if(a == b || b==c){
            System.out.print("a==b or b==c");
        }
        else{
            System.out.println("This is an else");
        }

        //          String conditionals

        String name = "bob";
        String name1 = "bobby";

        if (name.equals(name1)){
            System.out.println("thy're the same name!!!");
        }
        else{
            System.out.println("Thy're not the same");
        }

   }
}