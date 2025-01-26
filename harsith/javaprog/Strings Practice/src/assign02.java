public class assign02 {

    static int countOccurrence(String haystack, String needle) {

        int count = 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            String res = haystack.substring(i, i + needle.length());

            if (res.equals(needle)) {
                count++;
            }

        }
        return count;
    }

        public static void main (String[]args){
            System.out.println(countOccurrence("abbbba", "bb")); // Should return 3
        }
    }
