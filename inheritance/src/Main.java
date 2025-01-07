// Main Class
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Employee class
        Employee emp = new Employee("Alice", 30, "delhi");

        // Call the inherited method from the Person class
       System.out.println(emp);

        System.out.println(emp.display());
    }
}