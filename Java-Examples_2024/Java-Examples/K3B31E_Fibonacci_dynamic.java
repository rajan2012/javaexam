public class K3B31E_Fibonacci_dynamic {

   static long fib (int n)  {

      long[] f=new long[n+1];

      if (n <= 1) return n; 
      f[0]=0;
      f[1]=1;
      for (int i = 2; i <= n; i++ ) { 
         f[i]=f[i-1]+f[i-2];
      }
      return f[n];
   }

   public static void main(String[] args) {
      int k= Integer.parseInt(args[0]);
      System.out.println( 
             "Fibonacci ( " + k + " ) = " + fib (k) );
   }
} 
