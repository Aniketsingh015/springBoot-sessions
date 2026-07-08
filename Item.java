// item have a unidirectional relationship with company so added there with has a 
// relationship

public class Item {
    private int itemNo;
    private String itemName;
    private double itemPrice;

    // Getters and setter

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(){
        this.itemNo=itemNo;
    }

    public String getItemName(){
        return itemName;
    }
    public void setItemName(){
        this.itemName=itemName;
    }

    public double getItemPrice(){
        return itemPrice;
    }

    public void setItemPrice(){
        this.itemPrice=itemPrice;
    }

    // constructor
    void Item(int itemNo, String itemName,double itemPrice){
        this.itemNo=itemNo;
        this.itemName=itemName;
        this.itemPrice=itemPrice;
    }
}
