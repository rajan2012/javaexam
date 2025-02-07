public class  K4B09E_CLSum {
   public static void main( String args[] ) {

      int sum = 0, i;

      for (i = 0; i < args.length; i++)
         sum = sum + Integer.parseInt ( args [i] );
 
      System.out.println( 
            "The sum of the " + i + " elements is: " + sum);
   }
}
