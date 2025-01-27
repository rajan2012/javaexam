import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex4 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       int x=Integer.MAX_VALUE;

       System.out.println((int)Math.sqrt(x));

       int n=1;

        while (true) {
            if ((long) n * n > Integer.MAX_VALUE) {  // Check for overflow using long multiplication
                System.out.println("First overflow during squaring occurs at " + n);
                break;
            }
            n++;
        }

    }
}