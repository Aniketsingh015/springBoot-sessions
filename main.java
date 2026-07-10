public class main {
    public static void main(String[] args) {
        var company = new Company("Tech Innovators");
        company.setName("Tech Innovators");
        System.out.println("Company Name: " + company.getName());

        // company decided to add some items to its catalog
        var laptop = new Item(101, "Laptop", 1200.00);
        var smartPhone = new Item(102, "Smartphone", 800.00);
        company.addItem(laptop);
        company.addItem(smartPhone);

        System.out.println("Items in Company Catalog:");
        for(Item item:company.getItems()){
            System.out.println(item.getItemName()+ "-INR" +item.getItemPrice() + " Item No: " + item.getItemNo());
        }


        // Now a regular customer walked into our shop to buy the items which we have. 
        var regular =new Customer();
        regular.setCustomerID(1);
        regular.setName("Aniket Singh");

        // now customer wants to buy two pants and one shirt
        var orderItem1 = new OrderItem(laptop, 2);
        var orderItem2 = new OrderItem(smartPhone, 1);

        // Regular customer walks to the billing counter to place the order. 

        var Order1= new Order(); //order created for the customer
        Order1.setOrderID(1);    
        Order1.setCustomer(regular); //order is set for this customer
        Order1.addOrderItem(orderItem1);
        Order1.addOrderItem(orderItem2);

        // And the customer made the payment, and the order was over. 
        regular.addOrder(Order1);

        // now traction is complete then add customer to company
        company.addCustomer(regular);

        System.out.println("Total Order Value for the company: INR " + company.getTotalOrderValue());


       
}
}