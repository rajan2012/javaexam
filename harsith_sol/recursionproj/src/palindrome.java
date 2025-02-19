




import java.util.ArrayList;
import java.util.List;

//findin
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class palindrome {

    //recursion and normal logic

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true; // Base case: if pointers cross or meet, it's a palindrome
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false; // If characters don't match, not a palindrome
        }

        // Recursive case: check the inner substring
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // If characters don't match, not a palindrome
            }
            start++;
            end--;
        }
        return true; // If loop completes, it's a palindrome
    }

    public static boolean reversem2(String s1) {
        // Base case: if index is out of bounds for either string, return an empty string

        boolean flag=true;

       for(int i=0;i<s1.length()/2;i++)
       {
           if(s1.charAt(i)!=s1.charAt(s1.length()-(i+1)))
           {
               flag=false;
               break;
           }

       }
       return flag;

    }


    public static boolean reversem(String s1,int index) {
        // Base case: if index is out of bounds for either string, return an empty string

        if (index == s1.length()/2) {
            return true;
        }

        // If characters match at the current index, proceed to the next character
        if(s1.charAt(index)==s1.charAt(s1.length()-(index+1))) {
            return reversem(s1, index + 1);
        }
        else
        {
            return false;
        }

    }



    public static void main(String[] args) {

       boolean s1=reversem("deified",0);

        boolean s=reversem2("deified");

        System.out.println(s1);
            System.out.println(s);


    }
}
