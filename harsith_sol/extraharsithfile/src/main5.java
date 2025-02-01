

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main5 {

    public static String overlap(String s1,String s2)
    {
        int index=0;

        StringBuilder sb=new StringBuilder();

        if(s1.contains(s2))
        {
            index=s1.indexOf(s2);
        }

        String s3=s1.substring(0,index);

        String s4=s1.substring(index+s2.length());

        System.out.println(s3);

        System.out.println(s4);

        return s3+s2+s4;

    }

    public static void main(String[] args)
    {

        String a=overlap("xxyxxxExamplexxyxxx", "Example");

        System.out.println(a);

    }
}

