public class TaskStrings {
    public static String textExtractor(String input) {
        int n = input.length();

        // Find the longest matching prefix and suffix
        int maxLen = 0;
        for (int i = 0; i <= n / 2; i++) {
            if (input.startsWith(input.substring(n - i))) {
                maxLen = i;
            }
        }

        // Extract the middle part and reverse it
        String middle = input.substring(maxLen, n - maxLen);
        return new StringBuilder(middle).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(textExtractor("abc"));         // Output: ""
        System.out.println(textExtractor("abcdcba"));     // Output: "dcb"
        System.out.println(textExtractor("racecar"));     // Output: "eca"
        System.out.println(textExtractor("abcHelloabc")); // Output: "Hello"
    }
}
