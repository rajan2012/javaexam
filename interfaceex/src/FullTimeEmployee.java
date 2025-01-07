class FullTimeEmployee implements Employee {
    private String name;
    private double baseSalary;

    // Constructor
    public FullTimeEmployee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Implementing the work method from the interface
    @Override
    public void work() {
        System.out.println(name + " is working full-time.");
    }

    // Implementing the calculateSalary method from the interface
    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    // Overriding the default method if needed
    @Override
    public void getDescription() {
        System.out.println(name + " is a full-time employee with a fixed salary.");
    }
}