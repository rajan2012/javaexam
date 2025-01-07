// Main class to test the abstract class and its subclasses
public class Main {
    public static void main(String[] args) {
        // Creating instances of different types of employees
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("John Doe", 30, 5000, 1000);
        Employee partTimeEmp = new PartTimeEmployee("Jane Smith", 25, 20, 80);
        Employee contractEmp = new ContractEmployee("James Bond", 40, 3000, 12);

        // Displaying details of all employees
        System.out.println("Full-Time Employee Details:");
        fullTimeEmp.displayEmployeeDetails();

        System.out.println("\nPart-Time Employee Details:");
        partTimeEmp.displayEmployeeDetails();

        System.out.println("\nContract Employee Details:");
        contractEmp.displayEmployeeDetails();
    }
}