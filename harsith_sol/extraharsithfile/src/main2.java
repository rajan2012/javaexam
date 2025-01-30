import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main2 {

    public static String enc(String s1,int pos)
    {
       String s="";

       s=s.concat(s1.substring(s1.length()-(pos+1)));

        System.out.println(s);

       for(int i=0;i<s1.length()-pos;i++)
       {
           s+=s1.charAt(i);
       }

      return s;

    }

    public static void main(String[] args)
    {

        String a=enc("hello,world",2);

        System.out.println(a);

    }
}
