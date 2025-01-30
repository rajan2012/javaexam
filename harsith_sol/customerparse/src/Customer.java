

// Base class representing a Customer
class Customer {
    protected String name;
    protected String street;
    protected String city;

    // Constructor
    public Customer(String name, String street, String city) {
        this.name = name;
        this.street = street;
        this.city = city;
    }

    // Method to display formatted customer data
    public String getFormattedCustomer() {
        return "Customer: " + name + "\nStreet: " + street + "\nCity: " + city;
    }
}

// Derived class responsible for parsing a line of customer data

