import java.util.ArrayList;
import java.util.List;

public class main2 {

    public static  List<List<Integer>> findpairs(int[] a,int target)
    {
        int rem=0;

        int[] b=new int[2];

        List<Integer> l=new ArrayList<>();

        List<List<Integer>> l2=new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {

            rem=target-a[i];
            System.out.println("for i "+i+ " rem no to find is "+rem);
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]==rem)
                {
                    System.out.println("rem value matching at j "+j +" " + rem);
                    l.add(a[i]);
                    l.add(a[j]);
                    l2.add(l);
                    //l.removeAll(new ArrayList<>(l));
                    l=new ArrayList<>();

                }
            }
           // l2.add(l);
        }


        return l2;

    }

    public static boolean isrotation(String s1,String s2)
    {
        return true;

    }
    public static void main(String[] args) {

     int[] c={5, 3, 9, 2, 8, 4, 7};

        List<List<Integer>> d=findpairs(c,10);

        for(List<Integer> l:d)
        {
            System.out.println(l);
        }



    }
}
