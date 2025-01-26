import java.util.Scanner;

public class main5 {


        static String rearrange(String word, int[] sequence) {

            char[] chword = word.toCharArray();
            StringBuilder sb = new StringBuilder();

            for(int i =0;i< sequence.length;i++){
                if(sequence[i]<0 || sequence[i]>=word.length()){
                    return "invalid";
                }
            }

            for(int i =0;i< sequence.length;i++){

                sb.append(chword[sequence[i]]);
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


