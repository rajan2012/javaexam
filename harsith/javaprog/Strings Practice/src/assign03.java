public class assign03 {

    static String extractTag(String s){
        int start = s.indexOf("[") + 1;
        int end   = s.indexOf("]");

        return s.substring(start,end);

    }


    public static void main(String[] args) {
        // Example usage
        String result = extractTag("1234[5678]9");
        System.out.println(result); // Should print "5678"
    }
}
