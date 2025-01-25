import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int m=n;


      String s=Integer.toString(n);

      for(char c:s.toCharArray())
      {
          System.out.println(c);
      }


    }
}