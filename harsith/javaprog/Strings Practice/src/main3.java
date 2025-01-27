import java.util.Arrays;

public class main3 {

    static boolean isAnagram (String s1, String s2){

        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        if(s1.length()!=s2.length()){
            return false;
        }

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);


            return Arrays.equals(str1,str2);


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
