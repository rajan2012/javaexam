import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        boolean ispall = false;
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String res = "";
        for(int i =A.length()-1;i>=0;i--){

            res =  res + A.charAt(i)  ;
        }
        System.out.println(res);

        if(res.equals(A)){
            ispall = true;
        }
        else ispall = false;

        System.out.println(ispall);


    }
}



