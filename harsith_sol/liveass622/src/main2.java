import java.util.regex.*;
import java.lang.StringBuilder;

public class main2 {
    public static void main(String[] args) {
        String s = "@Hello @world! #Java$";
        StringBuilder symbols = new StringBuilder();

        // Regular expression to match any non-word character (symbols, punctuation, etc.)
        Pattern pattern = Pattern.compile("\\W");
        Matcher matcher = pattern.matcher(s);

        // Loop through and add matching symbols to StringBuilder
        while (matcher.find()) {
            symbols.append(matcher.group());
        }

        // Print the result
        System.out.println("Symbols found: " + symbols.toString());
    }
}
