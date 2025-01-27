import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {

    @Override
    public String toString() {
        return "anagram{}";
    }

    public static boolean isAnagram(String s1, String s2){

          s1 = s1.replaceAll("\\s+", "").toLowerCase();
          s2 = s2.replaceAll("\\s+", "").toLowerCase();


          if(s1.length()!=s2.length()){

              return false;

          }

          char[] ch1 = s1.toCharArray();
          char[] ch2 = s2.toCharArray();

          Arrays.sort(ch1);
          Arrays.sort(ch2);


          return Arrays.equals(ch1,ch2);

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
