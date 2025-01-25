import java.util.Scanner;




import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class largestdigit {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int max=Integer.MIN_VALUE;
       while(n!=0)
       {
           int digit=n%10;
           if(digit>max)
           {
               max=digit;
           }
           n=n/10;
       }

       System.out.println(max);


    }
}