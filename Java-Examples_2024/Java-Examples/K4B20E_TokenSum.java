import java.util.*;
/*  computes the sum of the input numbers */
public class K4B20E_TokenSum {
   public static void main(String[] args) {
      int sum = 0;
      String numbers = "10 20 30 40";//JOptionPane.showInputDialog 
//            ("input numbers," + "\n(separated by spaces): ");

      StringTokenizer tokens = new StringTokenizer (numbers);

      while (tokens.hasMoreTokens () )
         sum = sum + Integer.parseInt (tokens.nextToken () );

      System.out.println("Sum: "+sum);
//      JOptionPane.showMessageDialog (null, "Sum: " + sum );
   }
} 
