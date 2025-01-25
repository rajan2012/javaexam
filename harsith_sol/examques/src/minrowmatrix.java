import java.util.ArrayList;
import java.util.List;

//findin
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class minrowmatrix {


    public static int[]  minfind2(int[][] m)
    {
        int min = Integer.MAX_VALUE;

        int[] a=new int[m[0].length];

        for(int j=0;j<m[0].length;j++)
        {
            min = Integer.MAX_VALUE;
            for(int i=0;i<m.length;i++)
            {
                if(m[i][j]<min)
                {
                    min=m[i][j];
                }

            }
            //why j because we are storing min value of each col
            //so iterating over col
            a[j]=min;

        }
        return a;
    }

    public static List<Integer>  minfind(int[][] m)
    {
        int min = Integer.MAX_VALUE;

        List<Integer> a=new ArrayList<>();

        for(int j=0;j<m[0].length;j++)
        {
            min = Integer.MAX_VALUE;
            for(int i=0;i<m.length;i++)
            {
                if(m[i][j]<min)
                {
                    min=m[i][j];
                }
            }
            a.add(min);
        }


        return a;
    }

    public static void main(String[] args) {

        int[][] m = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 0}
        };

        int[] b=minfind2(m);


        for(int k:b)
        {
            System.out.println(k);
        }

    }
}