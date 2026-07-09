public class main {
    public static void main(String[] args) {
        var company = new Company("Tech Innovators");
        company.setName("Tech Innovators");
        System.out.println("Company Name: " + company.getName());


        // displaying the total order value of the company
        double totalOrderValue = company.getTotalOrderValue(); 
        System.out.println("Total Order Value: " + totalOrderValue);
    }
}
