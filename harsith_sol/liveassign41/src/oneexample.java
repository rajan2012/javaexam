public class oneexample
{

    public static int countCat(String str) {

        // Base case: If length of string is less than 3, "cat" can't exist
        if (str.length() < 3) {
            return 0;
        }

        // Check if the first three characters are "cat"
        if (str.startsWith("cat")) {
            return 1 + countCat(str.substring(1)); // Move one step ahead
        } else {
            return countCat(str.substring(1)); // Move one step ahead
        }
    }

    public static int catfind(String s)
    {

        int sum=0;
        if(!s.contains("cat"))
        {
            return 0;
        }
        else {

            sum++;
            int index=s.indexOf("cat");
            return sum + catfind(s.substring(3+index));

        }

    }
    public static String ex(String s)
    {
        String[] s1=s.split(" ");

        String s4="";

        for(String s2:s1)
        {
            s4+=s2.charAt(0);
        }

        return s4;
    }

    public static String ex2(String s)
    {
        String[] s1=s.split(" ");

        StringBuilder sb=new StringBuilder();
        for(String s2:s1)
        {
            if(s2.contains("@"))
            {
                System.out.println(s2);
                sb.append(s2);
            }
        }

        return sb.toString();

    }


    public static void main(String[] args)
    {
        String s= "this is @name1 pass @name2";

       //String s4=ex(s);

       // System.out.println(s4);

        //  String s4=ex2(s);

       // System.out.println(s4);

        int n=catfind("catcatcatdogdogcat");

        System.out.println(n);



    }
}