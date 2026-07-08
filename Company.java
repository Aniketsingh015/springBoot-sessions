import java.util.*;
class Company {
    // data element-private and protected
    private String name;

    // has-A company has many items so how to create a relationship btw them
    // Early initialization
    // private List <Item> items=new ArrayList<Item>();
    // rather than early inisaliaztion create variable and inistialize in constructor
    private List<Item> items;
    // getter and setter methods-to access the data elements

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
        this.items=new ArrayList<>();
    }

    

    
    

}
