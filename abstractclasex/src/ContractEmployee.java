class ContractEmployee extends Employee {
    private int contractDurationInMonths;

    // Constructor
    public ContractEmployee(String name, int age, double salary, int contractDurationInMonths) {
        super(name, age, salary);
        this.contractDurationInMonths = contractDurationInMonths;
    }

    // Implementing the abstract method to calculate the salary
    @Override
    public double calculateSalary() {
        return getSalary() * contractDurationInMonths;  // Contract employee gets fixed salary for the entire contract
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); // Displaying the common details from the parent class
        System.out.println("Contract Duration: " + contractDurationInMonths + " months");
    }
}