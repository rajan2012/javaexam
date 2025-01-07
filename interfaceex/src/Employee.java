interface Employee {
    // Abstract methods (no body)
    void work();
    double calculateSalary();

    // Default method (can have a body)
    default void getDescription() {
        System.out.println("This is an employee.");
    }
}


