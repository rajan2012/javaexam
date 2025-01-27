public class exception6 {

    public static String validateString(String input) {
        // Use split method to divide the input string
        String[] parts = input.split("\\s+");

        // Check if the input format is correct
        if (parts.length != 3) {
            throw new RuntimeException("Invalid format. Expected format: 'number <operator> number'.");
        }

        try {
            int left = Integer.parseInt(parts[0]);
            String operator = parts[1].trim();
            int right = Integer.parseInt(parts[2]);

            // Check the operator and compare the numbers accordingly
            if (operator.equals(">")) {
                if (left > right) {
                    return "valid";
                } else {
                    return "left is not larger than right";
                }
            } else if (operator.equals("<")) {
                if (left < right) {
                    return "valid";
                } else {
                    return "left is larger than right";
                }
            } else {
                throw new RuntimeException("Invalid operator. Expected '>' or '<'.");
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("Invalid number format.");
        }
    }

    public static void main(String[] args) {
        try {
            // Test the method with valid input
            System.out.println(validateString("10 > 5"));

            // Test the method with invalid input
            System.out.println(validateString("5 > 10"));

            // Test with incorrect format
            System.out.println(validateString("5 ? 10"));
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}
