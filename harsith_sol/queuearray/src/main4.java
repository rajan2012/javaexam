public class main4 {


    public static int rotapoint(String s1,String s2)
    {
        int j=0;
        int i=0;
         for( i=0;i<s1.length();i++)
         {
             while(i<s1.length()&&(s1.charAt(j)==s2.charAt(i)))
             {
                // System.out.println("i and j are "+i+" "+j);
                 i++;
                 j++;


             }
            // System.out.println("i and j are "+i+" "+j);
            // j++;
         }
        System.out.println("i and j are "+i+" "+j);
         return Math.abs((j-1)-(i-1)+1);
    }

    public static boolean rotapoint2(String s1,String s2)
    {
        String s3=s1+s2;
        if(s3.contains(s2))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

       int a= rotapoint("rajansah","sahrajan");

       System.out.println("a is "+a);

       System.out.println(rotapoint2("rajansah","sahrajan"));

    }
}
