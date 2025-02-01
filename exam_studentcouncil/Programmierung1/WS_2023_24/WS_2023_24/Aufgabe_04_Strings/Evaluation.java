import java.util.*;

public class Evaluation {

    public static void main (String [] args){
        
       
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int n = sc.nextInt();
        if (n==0) s=null;

        System.out.print("stringTest(\"" +  s + "\") = ");
        
        String t = A4.stringTest ( s );
            
        System.out.println("\"" + t + "\"" );

    }
}
