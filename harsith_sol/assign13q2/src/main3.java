import java.util.Arrays;

public class main3 {

    public static String check(String s1,String s2)
    {
        int l1=s2.length();
        int index=0;
        int cnt=0;

        for(int i=0;i<s1.length()-s2.length()+1;i++)
        {
            System.out.println("i is is "+i);
            index=s1.indexOf(s2,i);



            if(index!=-1)
            {
                System.out.println("index is "+index);
                cnt++;
                i=index+s2.length()-1;
            }



        }

        if(cnt==2)
        {
            return s1.substring(index+s2.length());
        }

        System.out.println("count is "+cnt);

return "";

    }
    public static void main(String[] args) {
        int[] d=new int[]{0,1,1};

        System.out.println(Arrays.toString(d));

        String s=check("hellohellol","hello");

        System.out.println("returned string is "+s);
    }
}
