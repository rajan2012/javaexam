public class Main {
    public static void main(String[] args) {
        // Create a FullTimeEmployee object
        Employee fullTimeEmp = new FullTimeEmployee("John Doe", 5000);
        fullTimeEmp.work();  // Calls the work method
        System.out.println("Salary: $" + fullTimeEmp.calculateSalary());
        fullTimeEmp.getDescription();  // Calls the overridden default method


        // Create a PartTimeEmployee object
        Employee partTimeEmp = new PartTimeEmployee("Jane Smith", 20, 25);
        partTimeEmp.work();  // Calls the work method
        System.out.println("Salary: $" + partTimeEmp.calculateSalary());
        partTimeEmp.getDescription();  // Calls the overridden default method
    }
}
