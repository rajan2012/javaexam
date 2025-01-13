public class Main {
    public static void main(String[] args) {
        // Create Professor
        Professor prof = new Professor("John", "Smith", "123 Elm Street", "A101", "123-456-789");

        // Create Assistants
        Assistant assistant1 = new Assistant("Alice", "Brown", "456 Oak Street", "A102", "987-654-321", prof);
        Assistant assistant2 = new Assistant("Bob", "Green", "789 Pine Street", "A103", "456-789-123", prof);

        // Create Student
        Student student = new Student("Charlie", "White", "101 Maple Street");

        // Print all members
        System.out.println("Professor:\n" + prof);
        System.out.println("\nAssistant 1:\n" + assistant1);
        System.out.println("\nAssistant 2:\n" + assistant2);
        System.out.println("\nStudent:\n" + student);

        // Test resign and employed()
        System.out.println("\nAssistant 1 resigns...");
        assistant1.resign();
        System.out.println("Assistant 1 employed? " + assistant1.employed());
        System.out.println("Professor:\n" + prof);
    }
}
