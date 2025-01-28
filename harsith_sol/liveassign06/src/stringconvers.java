import java.util.Scanner;

public class stringconvers {

    public static void find(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0.0; // Variable to store the converted number

        while (true) { // Infinite loop to repeatedly ask for input until valid
            System.out.println("Enter a number:");
            String input = scanner.nextLine(); // Read input as a string

            try {
                // Attempt to convert the string into a double
                number = Double.parseDouble(input);
                break; // Exit the loop if conversion is successful
            } catch (NumberFormatException e) {
                // Catch any exception due to invalid conversion
                // Do nothing and let the loop repeat
            }
        }

        System.out.println("Valid number entered: " + number); // Output the valid number
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        while(true) {
            String s = sc.nextLine();
            try {
                n = Integer.valueOf(s);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("here " + n);
            }
        }
    }
}


