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


       
}
}