// Abstract class for Employee
abstract class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Abstract method for calculating the salary (to be implemented by subclasses)
    public abstract double calculateSalary();

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for the age
    public int getAge() {
        return age;
    }

    // Getter for the salary
    public double getSalary() {
        return salary;
    }

    // Method to display the employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: " + calculateSalary());
    }
}
