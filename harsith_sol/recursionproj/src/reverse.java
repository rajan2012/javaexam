


import java.util.ArrayList;
import java.util.List;

//findin
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class reverse {

    //recursion and normal logic

    public static String reverseUsingRecursion2(String str) {
        if (str == null || str.length() <= 1) {
            return str; // Base case: empty or single-character string
        }
        // Reverse the rest of the string and add the first character to the end
        return reverseUsingRecursion2(str.substring(1)) + str.charAt(0);
    }

    public static String reversem2(String s1) {
        // Base case: if index is out of bounds for either string, return an empty string

        if (s1.length()==0) {
            return "";
        }

        String s="";

        char[] c=new char[s1.length()];

        int i=0;
        // If characters match at the current index, proceed to the next character
        while( i<s1.length()){
            s+= s1.charAt(s1.length() - (i + 1));

           // s+= s1.charAt(s1.length() - (i + 1));

            c[i]= s1.charAt(s1.length() - (i + 1));
            i++;
        }

        System.out.println("using string "+s);
        System.out.println("using char "+new String(c));

        return s;

    }

    public static String reversem(String s1,int index) {
        // Base case: if index is out of bounds for either string, return an empty string

        if (index >= s1.length()) {
            return "";
        }

        // If characters match at the current index, proceed to the next character
        return s1.charAt(s1.length()-(index+1))+reversem(s1,index+1);

    }



    public static void main(String[] args) {

        //String s=reversem("madame",0);

        String s=reversem2("madame");

        if(s.length()==0) {
            System.out.println("");
        }
        else
        {
            System.out.println(s);
        }

    }
}
