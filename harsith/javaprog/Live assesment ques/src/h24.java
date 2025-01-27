import java.util.Scanner;

public class h24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompting for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Populate the array
        System.out.println("Enter " + size + " integers:");
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }

        // Scavenger hunt logic
        int index = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Index: " + index + ", Value: " + array[index]);
            index = array[index];

            // Optional: Check if the new index is out of bounds
            if (index < 0 || index >= size) {
                System.out.println("Index out of bounds. Ending the hunt.");
                break;
            }
        }
    }
}
