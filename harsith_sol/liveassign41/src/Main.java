//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static int maxsum(int[][] a)
    {
        int index=0;
        int previoussum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                sum+=a[i][j];
            }
            if(sum>previoussum)
            {
                index=i;
                previoussum=sum;
            }
            sum=0;
        }
        System.out.println("previoussum "+previoussum);
        return index;
    }

    static int minSum(int[][] a)
    {
        int index=0;
        int previoussum=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                sum+=a[i][j];
            }
            if(sum<previoussum)
            {
                index=i;
                previoussum=sum;
            }
            sum=0;
        }
        System.out.println("previoussum "+previoussum);
        return index;
    }


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        int[][] matrix = {
                {1, 2, 3, 4},
                {28, 22, 17, 19},
                {18, 27, 20, 43},
                {10, 10, 11, 18}
        };

        int a= minSum(matrix);

        System.out.println(a);

    }
}