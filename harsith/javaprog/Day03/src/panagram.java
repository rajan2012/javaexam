public class panagram {

    public static boolean isPangram(String sentence){

        String low = sentence.toLowerCase();

        for(char letter = 'a'; letter<= 'z';letter++){

            if(low.indexOf(letter) < 0){

                return false;
            }

        }
return  true;

    }


    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";

        if (isPangram(sentence)) {
            System.out.println("Is a pangram");
        } else {
            System.out.println("Isn’t a pangram!");
        }
 }
}