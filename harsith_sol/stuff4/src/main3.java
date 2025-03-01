public class main3 {

    public static String rev(String s,String revs)
    {

        if(s.length()<revs.length())
            return "";

        if(s.startsWith(revs))
        {
            //call method which revser this part of string
            return rev(s.replace(revs,"cba").substring(revs.length()),revs);

        }
        else
        {
           return  rev(s.substring(1),revs);
        }

    }

    public static void main(String[] args) {

        String s="abcxyzyxabc";

        String rev="abc";

        String res=rev(s,rev);

        System.out.println(res);


    }
}