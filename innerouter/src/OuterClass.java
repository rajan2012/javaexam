public class OuterClass {
    private String message = "Hello from Outer Class";

    // Inner Class
    class InnerClass {
        void displayMessage() {
            System.out.println("Message from Outer Class: " + message);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the Outer Class
        OuterClass outer = new OuterClass();

        // Create an instance of the Inner Class
        OuterClass.InnerClass inner = outer.new InnerClass();


        inner.displayMessage();
    }
}
