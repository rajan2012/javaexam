import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);

         while(true)
         {
             String s=sc.nextLine();
             try{
                 double d=Double.valueOf(s);
                 System.out.println("converted stirng "+d);
                 break;
             }
             catch(Exception e)
             {
                 System.out.println("no conversion for");
             }
         }

    }
}