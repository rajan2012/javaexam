import java.util.HashMap;
import java.util.Map;

public class main4 {

    public static boolean checkanagrams(String s,String s2)
    {

        int[] c=new int[256];

        int[] c2=new int[256];

        boolean flag=true;

        for(char c1:s.toCharArray())
        {
            c[c1]++;
        }

        for(char c3:s2.toCharArray())
        {
            c2[c3]++;
        }

        for(int i=0;i<256;i++)
        {
            if(c[i]!=c2[i])
            {
                flag=false;
            }
        }

        return flag;
    }

    public static void main(String[] args)
    {

        boolean b=checkanagrams("triangle","integral");

        System.out.println(b);

    }
}
