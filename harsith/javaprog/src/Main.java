import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the flag: ");
        int flagSize = sc.nextInt();

        for (int i = 1; i <= flagSize; i++) { // Loop for each row
            System.out.print("|"); // Start of a new row
            for (int j = 1; j <= flagSize; j++) { // Loop for each column
                // Check for the top row or diagonal from bottom left to top right
                if (i == j || (flagSize + 1 - j) == i) {
                    System.out.print("xxx");
                } else {
                    System.out.print("___");
                }
            }
            System.out.println("|"); // End of a row
        }
    }
}