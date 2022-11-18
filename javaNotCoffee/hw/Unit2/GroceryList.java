import java.security.GeneralSecurityException;

public class GroceryList {
    /*
     Things to add:
          addItem(GroceryItem item) *
          removeItem(GroceryItem item) *
          findItem() -> returns String -> "item#\titemName\titemCost" *
          totalCost() -> returns double *
          modifyCost(newCost) *
          sortItemsByCost() 

    */
    private GroceryItem[] itemList;
    
    public GroceryList(int howmany) {
        this.itemList = GroceryItem[howmany];
    }

    public GroceryList(){
        this.itemList = GroceryItem[0];
    }

    public void addItem(GroceryItem newItem){
        GroceryItem[] newList = GroceryItem[this.itemList.lengt + 1];
        for(int i=0;i<this.itemList.length;i++){
            newList[i] = this.itemList[i];
        }
        newList[this.itemList.length] = newItem;
        this.itemList = newList;
    }

    public void removeItem(GroceryItem item){
        boolean removedItem = false;
        GroceryItem[] newList = GroceryItem[this.itemList.length-1];
        for(int i = 0;i<this.itemList.length-1;i++){
            //check if we are on the removed item
            if(this.itemList[i].equals(item)&&!removedItem){
                removedItem = true;
            }
            if(!removedItem){
                newList[i] = this.itemList[i];
            }
            else{
                newList[i] = this.itemList[i+1];
            }
            this.itemList = newList;
        }
    } 
    
    public void removeItem(String item){
        boolean removedItem = false;
        GroceryItem[] newList = GroceryItem[this.itemList.length-1];
        for(int i = 0;i<this.itemList.length-1;i++){
            //check if we are on the removed item
            if(this.itemList[i].equals(item)&&!removedItem){
                removedItem = true;
            }
            if(!removedItem){
                newList[i] = this.itemList[i];
            }
            else{
                newList[i] = this.itemList[i+1];
            }
            this.itemList = newList;
        }
    } 

    public String findItem(String item) {
        for(int i=0;i<this.itemList.length;i++){
            if(this.itemList[i].equals(item)){
                return String.format("%d/", i)+this.itemList[i].toString();
            }
        }
        return "Item dose not exist in the list";
    }

    public String findItem(GroceryItem item) {
        for(int i=0;i<this.itemList.length;i++){
            if(this.itemList[i].equals(item)){
                return String.format("%d/", i)+this.itemList[i].toString();
            }
        }
        return "Item dose not exist in the list";
    }

    public double totalCost() {
        double total = 0;
        for(int i=0;i<this.itemList.length;i++){
            total+=this.itemList[i].getCost();
        }
        return total;
    }

    //do this when I have more coffee!!!
    public void sortItemsByCost(){
        GroceryItem[] newList = GroceryItem[this.itemList.length];

    }
}
