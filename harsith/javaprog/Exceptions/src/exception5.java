import java.util.StringTokenizer;

public class exception5 {

    public static String validateString(String input) {


        StringTokenizer st = new StringTokenizer(input, " ");


        if (st.countTokens() != 3) {
            throw new RuntimeException("Invalid format. Expected format: 'number <operator> number'.");
        }

        int left = Integer.parseInt(st.nextToken());
        String operator = st.nextToken().trim();
        int right = Integer.parseInt(st.nextToken());

        try {
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
                    return "left is  larger than right";
                }
            } else {
                throw new RuntimeException("Invalid operator. Expected '>' or '<'.");
            }
        }
        catch (NumberFormatException e){
            throw new RuntimeException("Invalid number format.");
        }
    }


    public static void main(String[] args){
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
