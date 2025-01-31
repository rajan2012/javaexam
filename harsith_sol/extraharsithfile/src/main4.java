public class main4 {

    public static String contentsLine(String s, String t){

        int remlen=30-(s.length()+t.length());

        if(s.length()+t.length()>27)
        {
            return null;
        }

        StringBuilder sb= new StringBuilder();

        sb.append(s);

        for(int i=0;i<remlen;i++)
        {
            sb.append(".");
        }

        sb.append(t);

return sb.toString();


    }

    public static void main(String[] args) {
        // Example usage of the contentsLine method
        System.out.println(contentsLine("Chapter 5", "123")); // Expected: "Chapter 5..................123"
        System.out.println(contentsLine("A very long chapter title", "Page 100")); // Expected: null, because it's too long
    }
}
