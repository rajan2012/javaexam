import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotation {

    public static double calculate(String s) throws Exception {
        Stack<Double> stack = new Stack<>();
        String[] tokens = s.split("\\s+");

        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) { // Check if token is a number
                stack.push(Double.parseDouble(token));
            } else if (token.matches("[+\\-*/]")) { // Check if token is an operator
                if (stack.size() < 2) {
                    throw new Exception("Not enough operands in stack");
                }
                double b = stack.pop();
                double a = stack.pop();
                double result;

                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        if (b == 0) throw new ArithmeticException("Division by zero");
                        result = a / b;
                        break;
                    default:
                        throw new Exception("Invalid operator");
                }

                System.out.println("Calculating: " + a + " " + token + " " + b);
                stack.push(result);
            } else {
                throw new Exception("Invalid token: " + token);
            }
            System.out.println("Stack: " + stack);
        }

        if (stack.size() == 1) {
            return stack.pop();
        } else {
            throw new Exception("Invalid RPN expression");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String calcString = sc.nextLine();

        try {
            System.out.println("Input: " + calcString);
            System.out.println(calculate(calcString));
        } catch (Exception e) {
            System.out.println("Throws Exception: " + e.getMessage());
        }
    }
}
