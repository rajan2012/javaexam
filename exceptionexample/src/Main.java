import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // To consume the newline left by nextInt()
            System.out.print("Enter Role: ");
            String role = sc.nextLine();

            Employee employee = new Employee(name, age, role);

            // Try adding a valid project
            Project project1 = new Project("AI Model", 6, 100000);
            employee.addProject(project1);

            // Try adding a null project (this should print an error message)
            employee.addProject(null);

            // Display the employee details
            employee.displayDetails();
        } catch (InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
