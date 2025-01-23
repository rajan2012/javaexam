import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main6 {

    // Method to divide the string into parts
    public static List<String> divideString(String str, int parts) {
        List<String> result = new ArrayList<>();

        // Handle edge cases
        if (parts <= 0 || str.isEmpty()) {
            System.out.println("Invalid input. Parts must be greater than 0 and the string must not be empty.");
            return result;
        }

        int length = str.length();
        int partSize = length / parts; // Minimum size of each part
        int remainder = length % parts; // Extra characters to distribute

        int startIndex = 0;

        for (int i = 0; i < parts; i++) {
            int endIndex = startIndex + partSize + (remainder > 0 ? 1 : 0);
            result.add(str.substring(startIndex, Math.min(endIndex, length))); // Add substring to result
            startIndex = endIndex;
            remainder--;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        // Input number of parts
        System.out.print("Enter the number of parts: ");
        int parts = scanner.nextInt();

        // Divide the string and print the result
        List<String> dividedParts = divideString(str, parts);

        if (!dividedParts.isEmpty()) {
            System.out.println("Divided parts:");
            for (String part : dividedParts) {
                System.out.println(part);
            }
        }

        scanner.close();
    }
}
