public class main {
    public static void main(String[] args) {
        var company = new Company("Tech Innovators");
        company.setName("Tech Innovators");
        System.out.println("Company Name: " + company.getName());

        // company decides to add items to its catalog
        // first create the object of item class to add in company class
        var shirt = new Item(1, "Shirt" ,2000.0);
        var pant = new Item(2, "Pant", 3000.0);
        var shoes= new Item(3, "Shoes", 5000.0);

        // in this way u will add items to the company catalog and then you can access them from outside using getter method
        company.addItem(shirt);
        company.addItem(pant);
        company.addItem(shoes);

        // using getter setter of item class to access the data from outside
        System.out.println("Items in the catalog:");
        for (Item item : company.getItems()) {
            System.out.println("Item No: " + item.getItemNo() + ", Name: " + item.getItemName() + ", Price: " + item.getItemPrice());
        }


        // regular customer walks in shopper stops
        var customer1= new Customer();
        customer1.setCustomerID(101);
        customer1.setName("Aniket Singh");


        // customer wants to buy 2 pants and 1 shirt

        var OrderItem1 =new OrderItem(pant, 2);
        var OrderItem2 =new OrderItem(shirt, 1);

            // now regular customer walks to counter to place order
            var regularOrdder= new Order();
            regularOrdder.setOrderID(1);

            // setting the customer to the order
            regularOrdder.setCustomer(customer1); 

            regularOrdder.addOrderItem(OrderItem1);
            regularOrdder.addOrderItem(OrderItem2);

            // the regular customer made the payment and order is handed over

            customer1.addOrder(regularOrdder); // adding the order to the customer class as it is bidirectional

            // now the company has to add the customer to its list of customers
            company.addCustomer(customer1);


            // now registered customer walked into the store
            var registeredCustomer= new Customer();
            registeredCustomer.setCustomerID(102);
            registeredCustomer.setName("Rohit Kumar");

            // registered customer wants to buy 1 pant and 2 shoes



        // displaying the total order value of the company
        double totalOrderValue = company.getTotalOrderValue(); 
        System.out.println("Total Order Value: " + totalOrderValue);
    }
}
