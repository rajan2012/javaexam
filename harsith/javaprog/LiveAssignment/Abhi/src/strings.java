public class strings {

    public static String contentsLine(String s, String t){

        int totallength = s.length() + t.length();
        StringBuilder sb = new StringBuilder();

        int dotsneed = 30 - totallength;

        if(totallength>27){
            return null;
        }

        for(int i=0; i<dotsneed;i++){

            sb.append(".");
        }
        return s + sb.toString() + t;



    }

    public static void main(String[] args) {
        // Example usage of the contentsLine method
        System.out.println(contentsLine("Chapter 5", "123")); // Expected: "Chapter 5..................123"
        System.out.println(contentsLine("A very long chapter title", "Page 100")); // Expected: null, because it's too long
    }
}
