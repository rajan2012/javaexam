class MyClass {
    // Static variable: Shared by all instances of MyClass
    static int count = 0;

    // Final variable: Its value cannot be changed after initialization
    final int instanceValue;

    // Static final variable: Constant value shared by all instances
    static final double PI = 3.14159;

    // Constructor
    public MyClass(int value) {
        instanceValue = value;
        count++;  // Static variable shared across all instances
    }

    // Static method: Can be called without creating an object
    public static void incrementCount() {
        count++;
    }

    // Final method: Cannot be overridden by subclasses
    public final void displayInfo() {
        System.out.println("Count: " + count);
        System.out.println("PI: " + PI);
    }

    // Static final method: Cannot be overridden and called via class
    public static final void staticFinalMethod() {
        System.out.println("This is a static final method.");
    }
}