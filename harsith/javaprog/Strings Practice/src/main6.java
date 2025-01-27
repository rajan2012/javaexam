

    import java.util.Scanner;

    public class main6 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Don't change this part
            int index = 0;
            int numberOfSentences = sc.nextInt();
            sc.nextLine();

            // Part (a) -- from here on you are allowed to make changes
            int[] textArray = new int[numberOfSentences];

            // Part (b)
            while (index < numberOfSentences) {
                textArray[index] = sc.nextInt();
                index = index+1;
            }

            // Part (c)
            index = 0;
            while (index < numberOfSentences) {
                System.out.println(textArray[index]);
                index = index+1;
            }

        }
    }


