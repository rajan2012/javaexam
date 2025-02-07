public class K3B10E_DoWhile {
   public static void main(String[] args) {
      
      int i = 1, n=0, sum = 0;
      n = Integer.parseInt( args[0]);

      do {  // correct only for n > 0
         sum = sum + i;
         i++;
      } while (i <= n);

      System.out.println( "For n = " + n 
	+ " the sum is " + sum);
   }
}
