import java.util.Scanner;

public class Main {

    static int countUniqueWords(String s) {

        String low = s.toLowerCase();

        String[] parts = low.split("\\s+");

        int count = 0;

        for (int i = 0; i < parts.length; i++) {
            int j;
            for ( j = 0; j < i; j++)

                if (parts[i].equals(parts[j]))
                    break;

                if (i == j) {
                    count++;
                }

            }

        return count;
    }





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Sentence: ");
        String s = sc.nextLine();

        System.out.println("Word unique counter: " + countUniqueWords(s));

    }
}