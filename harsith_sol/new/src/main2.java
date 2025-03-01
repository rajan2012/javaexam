public class main2 {

    public static String iscompare(char a,char b)
    {
        if(a>b)
        {
            return new String(a);
        }
    }

    public static String charsort(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }

        return iscompare(s.charAt(0),s.charAt(1))+
    }

    public static void main(String[] args) {

        String s2=charsort("abc");

        System.out.println(s2);
    }
}
