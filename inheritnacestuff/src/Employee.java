
// Subclass: Employee, extends Person
public class Employee extends Person {
    String role;

    // Default constructor
    public Employee() {
        super();  // Calls the default constructor of Person
        this.role = "Not Assigned";
    }

    // Parameterized constructor
    public Employee(String name, int age, String role) {
        super(name, age);  // Calls the parameterized constructor of Person
        this.role = role;
    }

    // Constructor with only name and role
    public Employee(String name, String role) {
        super(name);  // Calls the constructor of Person with only name
        this.role = role;
    }

    // Method to display details specific to Employee
    @Override
    public void display() {
        super.display();  // Calls the display method of Person
        System.out.println("Role: " + role);
    }
}