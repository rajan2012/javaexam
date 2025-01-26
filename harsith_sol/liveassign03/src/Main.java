import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    Scanner sc=new Scanner(System.in);

    int a=sc.nextInt();

    double x=(double)2;

    //System.out.println(x);

        for(int i=0;i<10;i++)
        {
            System.out.println(x);
            x=(x+a/x)/2;
        }

    }
}