class Company {
    // data element-private and protected
    private String name;
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
    }

    

    
    

}
