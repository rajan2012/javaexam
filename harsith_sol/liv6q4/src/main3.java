import java.util.HashMap;
import java.util.Map;

public class main3 {

    public static boolean checkanagrams(String s,String s2)
    {
        Map<Character,Integer> m=new HashMap<>();

        Map<Character,Integer> m1=new HashMap<>();

        boolean flag=true;
        if(s.length()!=s2.length())
            return false;
        int count=0;
        for(char c:s.toCharArray())
        {

            m.put(c, m.getOrDefault(c,0)+1);
        }

        int count1=0;
        for(char c:s2.toCharArray())
        {

                m1.put(c, m1.getOrDefault(c,0)+1);

        }
        for(Character c1:m.keySet())
        {
            if(m.get(c1)!=m1.get(c1))
            {
                flag= false;
                break;
            }
        }

        for(Character c:m.keySet())
        {
            System.out.println("key "+ c+ " has"+  +m.get(c));
        }

        return flag;

    }

    public static void main(String[] args)
    {

        boolean b=checkanagrams("apple","paple");

        System.out.println(b);

    }
}
