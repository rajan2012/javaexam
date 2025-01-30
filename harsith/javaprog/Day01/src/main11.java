import java.util.Scanner;

public class main11 {

    public static String rearrange(String word, int[] sequence){

        char[] newword = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        String    res= "";

        for(int i =0; i< newword.length;i++){

           // sb.append(word.charAt(sequence[i]));
                 sb.append(newword[sequence[i]]);

        }
        return sb.toString();
    }


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
        System.out.println("Result: " + result);
    }
}
