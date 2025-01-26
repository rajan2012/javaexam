public class main6 {


    static int countOccurrence(String haystack, String needle){

        int count=0;

        for(int i=0; i< haystack.length();i++){

            if(haystack.startsWith(needle,i)){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        String haystack = "abbbba";
        String needle = "bb";
        System.out.println("The string \"" + needle + "\" occurs " + countOccurrence(haystack, needle) + " times in \"" + haystack + "\".");
    }
}
