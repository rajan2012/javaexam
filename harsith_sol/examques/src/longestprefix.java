import java.util.ArrayList;
import java.util.List;

//findin
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class longestprefix {

    public static String minfind2(String s1, String s2) {
        String res = "";

        // Get the minimum length of the two strings
        int len = Math.min(s1.length(), s2.length());

        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                // If characters don't match, break out of the loop
                break;
            }

            // If characters match, append to result
            res += s1.charAt(i);
        }

        return res;
    }


    public static String  minfind(String s1, String s2)
    {
       String res="";

       int len =Math.min(s1.length(),s2.length());

       // System.out.println(len);


        int i=0;
       while(i<len)
       {
           //System.out.println("i "+i);
           if(s1.charAt(i)==s2.charAt(i)) {
               res += s1.charAt(i);
              // System.out.println(res);



           }
           else
           {
               break;
           }
           i++;
       }


        return res;
    }

    public static void main(String[] args) {

        String s=minfind("hello","helicopter");

        if(s.length()==0) {
            System.out.println("");
        }
        else
        {
            System.out.println(s);
        }

    }
}