public class main3 {

public static String interleave(String a,String c)
{
    //give output as a1b2c3, when abc , 123 are 2 string

    StringBuilder sb=new StringBuilder();

    for(int i=0;i<a.length();i++)
    {
        sb.append(a.charAt(i)).append(c.charAt(i));
    }

    return sb.toString();
}

//to give abbccc (123 tells how many times each should display)

    public static String patternrep(String a,String c)
    {
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<a.length();i++)
        {
            int index=Integer.valueOf(String.valueOf(c.charAt(i)));


            for(int j=0;j<index;j++)
            {
                sb.append(a.charAt(i));
            }

        }

        return sb.toString();
    }

    public static String patternrep2(String a,String c)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            int index = Character.getNumericValue(c.charAt(i)); // Directly get numeric value
            sb.append(String.valueOf(a.charAt(i)).repeat(index)); // Use repeat() for simplicity
        }

        return sb.toString();
    }

    public static void main(String[] args)
    {
        String a="abc";
        String c="123";

        String res=patternrep2(a,c);

        System.out.println(res);


    }
}
