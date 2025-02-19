import java.util.Random;
import java.util.Scanner;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class randomnum {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] a=new int[n];

        int seed=sc.nextInt();

        Random r=new Random(seed);

        for(int i=0;i<n;i++)
        {
            a[i]=r.nextInt(0)+n;
        }

        for(int i=0;i<n;i++)
        {
           System.out.println(a[i]);
        }






    }
}
