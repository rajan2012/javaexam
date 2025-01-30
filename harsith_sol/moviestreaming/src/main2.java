public class main2 {

    public static String sequence(String s, String seq,String newseq)
    {
       String s2=s.replace(seq,newseq);

       return s2;
    }


    public static void main(String[] args)
    {
       String s3=sequence("abbbbc","bb","c");

       System.out.println(s3);
    }
}
