/*
order have a bidirectional relationship with customer so there in customer class we 
added order class as collection and here also we assign customer but not with list as company is one
*/
import java.util.*;
class Order{
    private int orderId;
    private Customer customer; //here we are implementing the bidirectional cllection
    private List <OrderItem> orderItems; //this will store in order 
    // orderItem has-A relationship
    

    public void setOrderID(int orderId){
        this.orderId=orderId;
    }

    public int getOrderID(){
        return this.orderId;

    }
// here customer getter and setter because bidirectional
    public Customer getCustomer(){
        return this.customer;
    }

    public void setCustomer(Customer customers){
        this.customer=customer;
    }

    public List <OrderItem> getOrderItems(){
        return this.orderItems;
    }

    public void addOrderItem(OrderItem orderItem){
        this.orderItems.add(orderItem);
    }

    public Order(){
        this.orderItems=new ArrayList<OrderItem>();
    }
}