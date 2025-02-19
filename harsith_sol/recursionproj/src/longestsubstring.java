import java.lang.reflect.Array;
import java.util.Arrays;

public class longestsubstring {


    public static String reversem(String s1) {
        // Base case: if index is out of bounds for either string, return an empty string

      int[] ch=new int[256];

      StringBuilder sb=new StringBuilder();

      String s="";

        int start=0;

      for(int i=0;i<s1.length();i++)
      {
          if(ch[s1.charAt(i)]==0)
          {
              System.out.println("i has "+i);
              System.out.println("character at this position "+s1.charAt(i)+"has value "+ch[s1.charAt(i)]);
              sb.append(s1.charAt(i));
              ch[s1.charAt(i)]++;

          }
          else
          {
              System.out.println("inside method "+sb.toString());
              if(s.length()<sb.length()) {
                  s = sb.toString();
              }
              Arrays.fill(ch,0);
              sb.setLength(0);

          }
      }

      return s;

    }

    public static void main(String[] args)
    {
        String s="Madam in Eden I’m Adam";

        String s1=reversem("abcabcdbb");

        System.out.println(s1);

    }
}


