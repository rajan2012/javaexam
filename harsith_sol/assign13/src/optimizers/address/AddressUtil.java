package optimizers.address;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class AddressUtil {
    // Private constructor to prevent instantiation
    private AddressUtil() {}

    // Splits an address into postal code and city
    static String[] splitAddress(AddressOptimizer ao) {
        if (ao == null) {
            return null;
        }

        String input = ao.getAddress().trim();

        // Regular expression for "5-digit postal code followed by a city"
        String regex = "^(\\d{5})\\s+([a-zA-ZäöüÄÖÜß ,\\-.()]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            return new String[]{matcher.group(1), matcher.group(2)};
        }

        return null; // Invalid format
    }
}
