import java.util.*;
// as customer has many order and order also represent customer that's why bidirectional
//as company is bidirectional we are implemeting it has a relationship
public class Customer {
    private int customerID;
    private String name;
    private List <Order> orders; 
    private Company company; 


    // this is getter and setter for collection of order
    public List<Order> getOrders(){
        return this.orders;
    }
    public void addOrder(Order order){
        this.orders.add(order);
    }

    
    
    public Company getCompany(){ // company getter
        return this.company;
    }

    public void setCompany(Company company){ //setter company
        this.company=company;
    }

    
    // customer main data getter and setter

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



    public Customer(){//constructor
        // initializing order array list-as it is bidirectional
        this.orders=new ArrayList<Order>();
    }

    


}

// IS-A relatioship we use unheritence
// HAS-A relationship we use collections

