public class Person {
    String name;
    int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with only name
    public Person(String name) {
        this.name = name;
        this.age = 18;  // default age
    }

    // Method to display details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}