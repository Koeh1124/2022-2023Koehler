//we don't see this but java extends the Obj. Class
public class Character{
    /*

     * Attributer (nound and adjs.)
     * health
     * armour
     * skin
     * hunger
     * inv.
     * xp
     * 
     * methods (verbs)
     * walk
     * sprint
     * crouch
     * build
     * swim
     * attack (mine)
     * 
     * 
     * 2k
     * attr.
     * height, weight, ar len, shoulder width, skin, stats
     * 
     * methods:
     * shoot, dribble, run, pass, watch ads
     * 
     * 
     * Ubisoft
     * Insominiac
     * 
     * 
     */
    //1. any and all global vars
    String name;
    int age;
    String school;
    boolean drive;

    // 2. any and all const.
    //professionally it has to match the file name
    public Character(){}    //no arg constructor

    public Character(String n){
        this.name=n;
    }

    public Character(String n, int a){
        this.name=n;
        this.age=a;
    }

    public Character(String n, int a, String s, boolean d){
        this.name=n;
        this.age=a;
        this.school = s;
        this.drive=d;
    }
    // 3. any and all methods
    //same thin as in py saying def __str__(self):
    //      return("")
    @Override       //decorctor
    public String toString(){
        return this.name;   
    }
}