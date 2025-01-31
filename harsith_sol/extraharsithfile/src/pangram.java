

public class pangram {

    public static String interleave(String a)
    {
       int[] ch=new int[26];

       a=a.replaceAll("\\s+","");

       for(int i=0;i<a.length();i++)
       {
           ch[a.charAt(i)-'a']++;
       }

       for(int i=0;i<ch.length;i++)
       {
           System.out.println((char) (i+'a') +" has "+ch[i]);
       }

       return "hello";


    }


    public static void main(String[] args)
    {


        String res=interleave("The quick brown fox jumps over the lazy dog");

        System.out.println(res);


    }
}

