// has-A company has many items so how to create a relationship btw them
    // Early initialization
    // private List <Item> items=new ArrayList<Item>();
    // rather than early inisaliaztion create variable and inistialize in constructor
    // getter and setter methods-to access the data elements

import java.util.*;
class Company {
    // data element-private and protected
    private String name;
    private List<Item> items;//this is unidirectional has a relational ship
    private List <Customer> customers;


    // getters and seeter for items
    public List<Item> getItems(){
        return this.items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    // getter and setters or customer

    public List <Customer> getCustomers(){
        return this.customers;
    }

    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }

    
    

    // get method is to access the elements from outside
    public String getName() {
        return name;
    }
    // set method is to set the value of the data elements from outside
    public void setName(String name) {
        this.name = name;
    }

    public Company(String name) {
        this.name = name;
        this.items=new ArrayList<Item>();
        this.customers=new ArrayList<Customer>();
    }


    // functional method

    public double getTotalOrderValue(){
        double totalOrderValue=0.0;

        for(Customer customer:this.customers){
            for(Order order:customer.getOrders()){
                for(OrderItem orderItem:order.getOrderItems()){
                    totalOrderValue+=orderItem.getQuantity()*orderItem.getItem().getItemPrice();
                }
            }
        }

        return totalOrderValue;
    }
    

    
    

}
