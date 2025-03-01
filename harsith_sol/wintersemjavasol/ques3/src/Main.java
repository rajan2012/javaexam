public class TaskRecursion {
    public static String charSort(String input) {
        return collectChars(input, 'a') + collectChars(input, 'b') + collectChars(input, 'c');
    }

    private static String collectChars(String input, char ch) {
        if (input.isEmpty()) return ""; // Base case: if input is empty, return empty string

        char firstChar = input.charAt(0);
        String restSorted = collectChars(input.substring(1), ch); // Recursive call for remaining string

        // If first character matches 'ch', add it to result, otherwise return only the rest
        return (firstChar == ch ? firstChar : "") + restSorted;
    }

    public static void main(String[] args) {
        System.out.println(charSort("bca"));       // Output: "abc"
        System.out.println(charSort("baabacbb"));  // Output: "aaaabbbc"
        System.out.println(charSort("ccccbcccc")); // Output: "bcccccccc"
        System.out.println(charSort("aaabbba"));   // Output: "aaaaabbb"
    }
}
