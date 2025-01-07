// PartTimeEmployee subclass
class PartTimeEmployee extends Employee {
    private int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, int age, double hourlyRate, int hoursWorked) {
        super(name, age, hourlyRate);  // Assuming salary is hourly rate for part-timers
        this.hoursWorked = hoursWorked;
    }

    // Implementing the abstract method to calculate the salary
    @Override
    public double calculateSalary() {
        return getSalary() * hoursWorked;  // Salary based on hourly rate and hours worked
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); // Displaying the common details from the parent class
        System.out.println("Hours Worked: " + hoursWorked);
    }
}