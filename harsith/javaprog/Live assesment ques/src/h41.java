import java.util.Scanner;

public class h41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Word: ");
        String word = sc.nextLine();

        System.out.print("Sequence: ");
        int[] sequence = new int[word.length()];
        for (int i = 0; i < word.length(); i++) {
            sequence[i] = sc.nextInt();
        }

        String result = rearrange(word,sequence);
        System.out.println(result);
    }
    public static String rearrange(String word, int[] sequence) {

        char[] chword = word.toCharArray();
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] >= word.length() || sequence[i] < 0)//if seq value is less than 0 or greater than or equal the word length return Invalid Seq
            {

                return "\"Invalid Sequence\"";
            }

        }
        for (int i = 0; i < sequence.length; i++) {

            st.append(chword[sequence[i]]);
        }

        return st.toString();
    }
}