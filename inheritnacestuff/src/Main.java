// Main class to test the code
public class Main {
    public static void main(String[] args) {
        // Using the default constructor of Employee
        Employee emp1 = new Employee();
        emp1.display();

        // Using the parameterized constructor of Employee
        Employee emp2 = new Employee("John", 25, "Manager");
        emp2.display();

        // Using the constructor with only name and role
        Employee emp3 = new Employee("Alice", "Developer");
        emp3.display();
    }
}