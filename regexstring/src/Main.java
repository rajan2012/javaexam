import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Input string
        String input = "Welcome to the Java programming world. Java is fun!";

        // Define the regex pattern
        String regex = "\\bJava\\b"; // Matches the word 'Java'

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher
        Matcher matcher = pattern.matcher(input);



        // Find matches and print results
        System.out.println("Input string: " + input);
        System.out.println("Matching pattern: " + regex);
        while (matcher.find()) {
            System.out.println("Match found: '" + matcher.group() + "' at position " + matcher.start());
        }
    }
}
