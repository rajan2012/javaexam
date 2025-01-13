//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static int countOccurrence(String haystack, String needle) {
        int cnt = 0; // Initialize count of occurrences
        int l2 = needle.length(); // Length of the needle

        // Edge case: if needle is empty or longer than haystack
        if (needle.isEmpty() || haystack.isEmpty() || l2 > haystack.length()) {
            return 0;
        }

        // Start searching for needle in haystack
        for (int i = 0; i <= haystack.length() - l2; i++) {
            // Check if substring from i to i + l2 matches the needle
            if (haystack.substring(i, i + l2).equals(needle)) {
                cnt++; // Increment count
                System.out.println("Match found at index: " + i);
            }
        }

        return cnt; // Return the total count
    }

    public static int countOccurrence2(String haystack, String needle) {
        if (needle.isEmpty() || haystack.isEmpty() || needle.length() > haystack.length()) {
            return 0; // Handle edge cases
        }

        int count = 0;
        int index = 0;

        // Search for needle in haystack
        while ((index = haystack.indexOf(needle, index)) != -1) {
            count++;
            index++; // Move to the next position for overlapping matches
        }

        return count;
    }


    public static String extractTag(String s)
    {

        int i=s.indexOf("[");
        int j=s.lastIndexOf("]");

        return s.substring(i+1,j);

    }

    public static void main(String[] args) {

        int c=countOccurrence("abbabba","bb");

        int c2=countOccurrence2("abbabba","bb");

        String s= extractTag("1234[5678]9");

        System.out.println(c);

        System.out.println(c2);

        System.out.println(s);

    }
}