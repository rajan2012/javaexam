public class K3B11E_Collatz {
   public static void main(String[] args) {
 
      int n = 0, inner = 0, outer = 0;
      n = Integer.parseInt( args[0] );
 
      while (n > 1) {	
         if (n % 2 != 0) {	
            n = 3 * n + 1; outer ++;
         }
         while (n % 2 == 0) {	
            n = n / 2; inner ++;
         }
      }	
 
      System.out.println( "n = 1 after " + inner 
               + " steps in the inner loop and " + outer 
               + " steps in the outer loop");
   }
}
