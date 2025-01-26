import java.util.Arrays;

public class string02 {

public static boolean isAnagram(String s1, String s2){

    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    char[] s11 = s1.toCharArray();
    char[] s22 = s2.toCharArray();

    Arrays.sort(s11);
    Arrays.sort(s22);

     if(Arrays.equals(s11,s22)){
         return true;
     }
        return false;
    }


    public static void main(String[] args){

        String s1 = "Listen";
        String s2 = "SIlent";

        if(isAnagram( s1,  s2)){

            System.out.println(s1 + " and " + s2 + " are anagrams.");
        }
        else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }

    }
}
