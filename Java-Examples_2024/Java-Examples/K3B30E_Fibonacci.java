public class K3B30E_Fibonacci {

   static long fib (int n)  {
      if (n==0) return 0; 
      else 
         if (n==1) return 1;
         else return ( fib (n-1) + fib (n-2) );
   }

   public static void main(String[] args) {
      int k= 44;//Integer.parseInt(args[0]);
      System.out.println( 
             "Fibonacci ( " + k + " ) = " + fib (k) );
   }
} 
