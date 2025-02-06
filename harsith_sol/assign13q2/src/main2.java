public class main2 {


    static int[] decomposeDate(String s)
    {
        String[] a=s.split("\\.");

        int[] b=new int[a.length];

        int i=0;
        for(String s1:a)
        {
            b[i]=Integer.parseInt(s1);
            i++;
        }

        return b;

    }

    public static void main(String[] args) {
        String text = "Hello, this is a Java tutorial!";
        String keyword = "Java";

        // Checking if "Java" is present at index 18
        boolean match = text.regionMatches(18, keyword, 0, keyword.length());

        System.out.println("Match found: " + match);  // Output: Match found: true

        // Case-insensitive comparison
        boolean matchIgnoreCase = text.regionMatches(true, 18, "java", 0, 4);
        System.out.println("Match found (case insensitive): " + matchIgnoreCase); // Output: Match found (case insensitive): true

        int[] c=decomposeDate("30.01.2025");

        for(int a:c) {
            System.out.println(a);
        }

    }
}
