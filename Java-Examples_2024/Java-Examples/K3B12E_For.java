public class K3B12E_For {
   public static void main(String[] args) {
      
      int i = 1, n = 0, sum = 0;
      n = Integer.parseInt( args[0]);

      for (i = 1; i <= n; i++){ 
         sum = sum + i;
      }

      System.out.println( "For n = " + n 
	+ " the sum is " + sum);
   }
}
