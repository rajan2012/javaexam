import java.util.Scanner;

public class Evaluation {

    // Method to compute a² / b and handle division by zero
    public double squareDiv(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("b is not allowed to be zero");
        }
        return (a * a) / b;
    }

    public static void main(String[] args) {
        Evaluation eval = new Evaluation();
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;

        while (true) {
            try {
                System.out.print("Enter value for a: ");
                double a = scanner.nextDouble();

                System.out.print("Enter value for b: ");
                double b = scanner.nextDouble();

                result = eval.squareDiv(a, b);  // Call method
                break; // Exit loop if no exception occurs
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input, please enter numbers.");
                scanner.next(); // Clear invalid input
            }
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
