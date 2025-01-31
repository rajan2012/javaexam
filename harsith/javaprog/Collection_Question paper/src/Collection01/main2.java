package Collection01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main2 {

    public static String overlap(String s1,String s2)
    {
        Set<String> s3=new HashSet<>();
        List<String> l=new ArrayList<>();


        for(String s4:s1.split("\\s"))
        {
            s3.add(s4);
        }

        for(String s5:s2.split("\\s"))
        {
            if(s3.contains(s5))
            {
                l.add(s5);
                s3.remove(s5);
            }
        }
        return l.toString();

    }

    public static void main(String[] args)
    {

        String a=overlap("this is trier","this is munchen");

        System.out.println(a);

    }
}
