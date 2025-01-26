import java.util.Scanner;

public class JaggedArrayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of rows
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        // Create a jagged array
        int[][] jaggedArray = new int[rows][];

        // Loop to create and fill each row
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter the number of columns for row " + (i + 1) + ":");
            int columns = scanner.nextInt();

            // Initialize the sub-array
            jaggedArray[i] = new int[columns];

            // Fill the sub-array
            System.out.println("Enter " + columns + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < columns; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Close the scanner
        scanner.close();

        // Display the jagged array
        System.out.println("Your jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
