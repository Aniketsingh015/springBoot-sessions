public class Customer {
    private int customerID;
    private String name;

    public int getCustomerID(){
        return this.customerID;
    }

    public void setCustomerID(int customerID){
        this.customerID=customerID;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }
}

// IS-A relatioship we use unheritence

class RegisteredCustomer extends Customer{
    private double discount;

    public double getDiscount(){
        return this.discount;
    }

    public void setDiscount(double discount){
        this.discount=discount;
    }
}