import java.util.ArrayList;
import java.util.List;

public class main2 {

    public static int[] findpairs(int[] a,int target)
    {
        int rem=0;

        int[] b=new int[2];

        List<Integer> l=new ArrayList<>();

        for(int i=0;i<a.length;i++)
        {
            rem=a[i]-target;
            for(int j=i+1;j<a.length-1;j++)
            {
                if(a[j]==rem)
                {
                    l.add(rem);
                    l.add(a[j]);
                }
            }
        }

        return l;

    }

    public static boolean isrotation(String s1,String s2)
    {
        return true;

    }
    public static void main(String[] args) {

     int[] c={1,2,3,4,5};

     int[] d=findpairs(c,4);

    }
}
