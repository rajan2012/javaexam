public class Main {
    public static void main(String[] args) {
        // Test the PhoneBook functionality
        PhoneBook.change("Alice", "123456");
        PhoneBook.change("Bob", "654321");
        PhoneBook.change("Alice", "111111"); // Update Alice's number

        System.out.println("Alice's number: " + PhoneBook.searchNumber("Alice")); // Output: 111111
        System.out.println("Bob's number: " + PhoneBook.searchNumber("Bob"));     // Output: 654321
        System.out.println("Eve's number: " + PhoneBook.searchNumber("Eve"));     // Output: unknown
    }
}