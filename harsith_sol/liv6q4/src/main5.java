import java.util.HashMap;
import java.util.Map;

public class main5 {

    public static String[] checkanagrams(String s,int parts)
    {
        //rajansah parts is 2
        int n=s.length()/parts;
        String[] s1=new String[parts];
        for(int i=0;i<parts;i++) {

           // System.out.println(s.substring(i*n, i + n));
            //(1*4,4+4)
            s1[i] = s.substring(i*n, i*n + n);
        }

        return s1;

    }

    public static void main(String[] args)
    {

        String[] b=checkanagrams("abcdefghijklmnopqrst",5);

        for(String s: b)
        {
            System.out.println(s);
        }

    }
}
