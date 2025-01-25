


import java.util.Scanner;



import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    public class palinddigit {
        public static void main(String[] args) {
            int number = 121;  // Try 121 or 123
            int original = number;
            int reversed = 0;

            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a Palindrome.");
            } else {
                System.out.println(original + " is not a Palindrome.");
            }
        }
    }
