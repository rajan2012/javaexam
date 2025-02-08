import java.util.ArrayList;
import java.util.List;

public class main3 {

    public static List<StringBuffer> isrotation(String s1,String s2) {

        int j=0;
        List<Character> l = new ArrayList<>();

        List<StringBuffer> l3 = new ArrayList<>();

        StringBuffer sb=new StringBuffer();

        List<List<Character>> l2 = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {

            for ( j = 0; j < s2.length(); j++) {
                while (i<s1.length()&&j<s2.length()&&(s1.charAt(i) == s2.charAt(j))) {

                    System.out.println("value of i is "+i+" has character "+s1.charAt(i));
                    System.out.println("value of j is "+j+" has character "+s2.charAt(j));
                    l.add(s1.charAt(i));
                    sb.append(s1.charAt(i));
                    i++;
                    j++;
                    System.out.println("here");
                }


                System.out.println("value of i "+i);
               // j=0;


            }
            if (!l.isEmpty()) {
                l2.add(l);
                l3.add(sb);
                l = new ArrayList<>();
                i--;
                sb=new StringBuffer();
                //j=0;
            }
        }

       // return l2;
        return l3;
    }

    public static boolean isrotation2(String s1,String s2,String s3) {



        return s1.equals(s2+s3)||s1.equals(s3+s2);

    }


    public static void main(String[] args) {

        String s="citytrier";
        String s2="triercity";

       // List<List<Character>> c=isrotation(s,s2);

        List<StringBuffer> c=isrotation(s,s2);

        /*
        for(List<Character> c1:c)
        {
            System.out.println(new String[]{c1.toString()});
        }

         */

        //call

        for(StringBuffer c1:c)
        {
            System.out.println(c1);
        }

        boolean f=isrotation2("rajansah","sah","rajan");

        System.out.println(f);
    }
}
