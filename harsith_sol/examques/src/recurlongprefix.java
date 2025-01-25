


import java.util.ArrayList;
import java.util.List;

//findin
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class recurlongprefix {

    public static String longestCommonPrefix(String s1, String s2, int index) {
        // Base case: if index is out of bounds for either string, return an empty string

        if (index >= s1.length() || index >= s2.length()) {
            return "";
        }

        // If characters match at the current index, proceed to the next character
        if (s1.charAt(index) == s2.charAt(index)) {
            return s1.charAt(index) + longestCommonPrefix(s1, s2, index + 1);
        } else {
            // If characters don't match, return an empty string (no common prefix)
            return "";
        }


    }



    public static void main(String[] args) {

        String s=longestCommonPrefix("hello","helicopter",0);

        if(s.length()==0) {
            System.out.println("");
        }
        else
        {
            System.out.println(s);
        }

    }
}
