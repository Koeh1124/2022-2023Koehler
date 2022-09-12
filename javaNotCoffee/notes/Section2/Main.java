public class Main {
    public static void main(String[] args) {
        //created an objec of Character Class
        Character c = new Character();
        System.out.println(c);
        Character b = new Character("bob");
        Character a = new Character("bobby",5);
        Character bobby = new Character("bobby",5,"bosse",true);
        System.out.println(b);
        System.out.println(a);
        System.out.println(bobby);
    }
}
