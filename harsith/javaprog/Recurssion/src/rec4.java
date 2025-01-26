public class rec4 {

    public static String g(String s, int n) {
        // Base case: if n is less than 0 or n wraps around the string length, adjust n accordingly
        if (n < 0) {
            n = s.length() - 1; // Wrap n to the last index if it goes negative
        } else if (n >= s.length()) {
            n = 0; // Wrap n to the start if it exceeds the string length
        }

        // Check the character at the current index n
        if (s.charAt(n) == 'X') {
            // If 'X' is found, return the index as a string
            return Integer.toString(n);
        } else if (s.charAt(n) == 'Y') {
            // If 'Y' is found, wrap around to the start of the string and continue
            return g(s, 0); // Change to a more meaningful operation if needed
        } else {
            // For any other character, simply move to the next index
            return g(s, n + 1);
        }
    }

    public static void main(String[] args) {
        String testString = "aXbYc";
        System.out.println(g(testString, 1)); // Initiates the recursion
    }
}
