public class Main {
    public static void main(String[] args) {
        // Accessing static variable using class name
        System.out.println("Initial count: " + MyClass.count);

        // Creating instances of MyClass
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(20);

        // Accessing instance and static variables
        System.out.println("Instance Value of obj1: " + obj1.instanceValue);
        System.out.println("Instance Value of obj2: " + obj2.instanceValue);

        // Accessing static method
        MyClass.incrementCount();

        // Accessing static final variable (constant)
        System.out.println("PI: " + MyClass.PI);

        // Calling static final method
        MyClass.staticFinalMethod();

        // Accessing final method from an object
        obj1.displayInfo();

        // Creating instance of subclass and calling inherited method
        SubClass subObj = new SubClass(30);
        subObj.displayInfo();

        SubClass.staticFinalMethod();

       // subObj.staticFinalMethod();
    }
}