public class K3B13E_Collatz_with_For {
   public static void main(String[] args) {
 
      int n = 0, inner = 0, outer = 0;
      n = Integer.parseInt( args[0] );
 
      for ( ; 
	    n > 1 ;
	    n= (n%2!=0) ? (3 * n + 1 + 0*(outer++)) 
			: (n / 2     + 0*(inner++ )) )
      {}
 
      System.out.println( "n = 1 after " + inner 
               + " steps in the inner loop and " + outer 
               + " steps in the outer loop");
   }
}
