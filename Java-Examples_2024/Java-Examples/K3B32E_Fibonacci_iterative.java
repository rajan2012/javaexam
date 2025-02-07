public class K3B32E_Fibonacci_iterative {

   static long fib (int n)  {
      if (n <= 1) return n; 
      long fib_0 = 1, fib_1 = 0, fib_2;
      for (int i = 2; i <= n; i++ ) { 
         fib_2 = fib_1;
         fib_1 = fib_0;
         fib_0 = fib_1 + fib_2;
      }
      return fib_0;
   }

   public static void main(String[] args) {
      int k= 45; //Integer.parseInt(args[0]);
      System.out.println( 
             "Fibonacci ( " + k + " ) = " + fib (k) );
   }
} 
