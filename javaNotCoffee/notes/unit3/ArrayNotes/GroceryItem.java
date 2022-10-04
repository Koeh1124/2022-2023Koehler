public class GroceryItem {
    
    private String name;
    private double cost;
    
    public GroceryItem(String Name, double Cost){
        this.name = Name;
        this.cost = Cost;
    }

    //getters and Setters
    public String getName(){
        return this.name;
    }

    public double getCost(){
        return this.cost;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setPrice(double newCost){
        this.cost = newCost;
    }

    //toString
    @Override
    public String toString(){
        return(this.name+"-"+String.valueOf(this.cost));
    }
}
