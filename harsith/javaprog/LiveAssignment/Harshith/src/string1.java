//Implement a method
//(10 Points)
//public static String rearrange(String word, int[] sequence)
//that is able to rearrange the characters in a given word word according to the given index values
// in the sequence array sequence.
// In case sequence contains numbers < 0 or >= word.length() return the String "Invalid Sequence".


import java.util.Scanner;

public class string1 {

    public static String rearrange(String word, int[] sequence){

        char[] chword = word.toCharArray();
        String result = " ";
        StringBuilder sb = new StringBuilder();

        for(int i=0;i< chword.length;i++){
            if(sequence[i]>= word.length() || sequence[i]<0)
            {
                result="Invalid Sequence";
                return result;
            }
        }
        for(int i=0;i< chword.length;i++){

            result = result + chword[sequence[i]];

        }
        for(int i=0;i< chword.length;i++){
            sb.append(word.charAt(sequence[i]));
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