public class K3B09E_While {
   public static void main(String[] args) {
      
      int i = 1, n=0, sum = 0;
      n = Integer.parseInt( args[0]);

      while (i <= n) {  // correct for n >= 0
         sum = sum + i;
         i++;
      }

      System.out.println( "For n = " + n 
	+ " the sum is " + sum);
   }
}
