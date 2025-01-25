
public class longestsubstring {


    public static boolean reversem(String s1,String sub) {
        // Base case: if index is out of bounds for either string, return an empty string

        if(s1.length()<sub.length()-1) {
            return false;

        }

        if(s1.startsWith(sub))
            return true;

        return reversem(s1.substring(1),sub);

    }

    public static void main(String[] args)
    {
        String s="Madam in Eden I’m Adam";

        boolean s1=reversem("rajan","na");

        System.out.println(s1);

    }
}


