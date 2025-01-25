import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


       Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();

       int m=sc.nextInt();

        int k=sc.nextInt();

       if(n<m)
       {
           for(int i=n;i<=m;i++)
           {
               if(i%k==0) {
                   System.out.print("beep"+" ");

               }
               else
               {
                   System.out.print(i+" ");
               }
           }
           System.out.println();
       }

        else
        {
            for(int i=n;i>=m;i--)
            {
                if(i%k==0) {
                    System.out.print("beep"+" ");

                }
                else
                {
                    System.out.print(i+" ");
                }
            }
        }



    }
}