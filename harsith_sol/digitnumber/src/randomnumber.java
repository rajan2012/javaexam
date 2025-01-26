import java.util.Random;
import java.util.Scanner;

public class randomnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size and seed: ");
        int size = scanner.nextInt();
        int seed = scanner.nextInt();

        int[] field = new int[size];
        Random random = new Random(seed);

        int negatives = 0, positives = 0;
        for (int i = 0; i < size; i++) {
            field[i] = random.nextInt(21) - 10; // Random numbers from -10 to 10
            if (field[i] < 0) {
                negatives++;
            } else if (field[i] > 0) {
                positives++;
            }
        }

        for (int i = 0; i < size; i++) {

            System.out.print("array: " + field[i]+" ");
        }
        System.out.println();

        System.out.println("Size: " + size);
        System.out.println("Seed: " + seed);
        System.out.println("Negatives: " + negatives);
        System.out.println("Positives: " + positives);
    }
}
