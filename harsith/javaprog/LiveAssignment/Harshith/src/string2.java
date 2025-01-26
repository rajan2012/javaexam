import java.util.HashSet;
import java.util.Scanner;

public class string2 {

    static int countUniqueWords(String s) {



            String[] words = s.toLowerCase().split("\\s+");
            int uniqueCount = 0;

            for (int i = 0; i < words.length; i++) {
                boolean isUnique = true;

                for (int j = 0; j < i; j++) {
                    if ( words[i].equals(words[j])) {
                       isUnique = false;
                       // words[j] = null;
                        break;
                    }
                }
                if (isUnique) {
                    uniqueCount++;
                }
            }

            return uniqueCount;
    }
        public static void main (String[]args){

            Scanner sc = new Scanner(System.in);

            System.out.print("Sentence: ");
            String s = sc.nextLine();

            System.out.println("Word unique counter: " + countUniqueWords(s));

        }

    }
