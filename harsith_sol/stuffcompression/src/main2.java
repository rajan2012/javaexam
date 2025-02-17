public class main2 {
    public static String digitsToAlphabet(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                int num = ch - '0'; // Convert char digit to int
                System.out.println("Converted num: " + num);
                int num2 = (int)(ch - 0);
                System.out.println("Converted num2: " + num2);
                char letter = (char) (num + 96); // Get corresponding letter
                result.append(letter);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "123";
        String output = digitsToAlphabet(input);
        System.out.println("Converted String: " + output);
    }
}
