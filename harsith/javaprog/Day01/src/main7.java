public class main7 {

    static String extractTag(String s){

        int start = s.indexOf('[')+1;
        int end = s.indexOf(']');

        return s.substring(start,end);

    }

    public static void main(String[] args) {
        String input = "1234[5678]9";
        System.out.println("Extracted tag: " + extractTag(input));
    }
}
