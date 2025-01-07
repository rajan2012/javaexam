// FullTimeEmployee subclass
class FullTimeEmployee extends Employee {
    private double bonus;

    // Constructor
    public FullTimeEmployee(String name, int age, double salary, double bonus) {
        super(name, age, salary);  // Calling the constructor of the parent class (Employee)
        this.bonus = bonus;
    }

    // Implementing the abstract method to calculate the salary
    @Override
    public double calculateSalary() {
        return getSalary() + bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); // Displaying the common details from the parent class
        System.out.println("Bonus: " + bonus);
    }
}