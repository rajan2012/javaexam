class PartTimeEmployee implements Employee {
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementing the work method from the interface
    @Override
    public void work() {
        System.out.println(name + " is working part-time.");
    }

    // Implementing the calculateSalary method from the interface
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Overriding the default method if needed
    @Override
    public void getDescription() {
        System.out.println(name + " is a part-time employee with hourly wages.");
    }
}