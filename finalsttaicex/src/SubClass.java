class SubClass extends MyClass {
    // Uncommenting this will give an error: Cannot override final method
    // @Override
    // public void displayInfo() {
    //    System.out.println("Overridden method");
    // }

    public SubClass(int value) {
        super(value);
    }
}