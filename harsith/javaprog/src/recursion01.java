public class recursion01 {

    public static void main(String[] args) {
        // Input string
        String input = "catcatcatdogcatdogcat";

        // Convert the input to lowercase for case-insensitive matching
        int count = Countcat(input.toLowerCase());

        // Print the result
        System.out.println(" occurs " + count + " times in \"" + input + "\"");
    }

    public static int Countcat(String str) {
        // Target string to find
        String Target = "cat";

        // Base case 1: If the length of str is smaller than the length of "cat"
        if (str.length() < Target.length()) {
            return 0; // There are no more "cat" occurrences
        }
        // Base case 2: If the first few characters of str match "cat" (case-insensitive)
        else if (str.substring(0, Target.length()).equalsIgnoreCase(Target)) {
            // Increment the count by 1 and continue searching in the rest of the string
            return 1 + Countcat(str.substring(1));
        }
        // Recursive case: If no match is found at the current position
        else {
            // Continue searching in the rest of the string by excluding the first character
            return Countcat(str.substring(1));
        }
    }
}
