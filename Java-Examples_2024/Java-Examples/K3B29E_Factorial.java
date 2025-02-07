public class K3B29E_Factorial {

   static long factorial (int n) {
      if (n == 0) return 1;
      else return (n * factorial (n-1));
   }

   public static void main (String[] args) {
     for (int  k=0; k<22; k++)
      System.out.println( 
         "Factorial of " + k + " is: " + factorial (k) );
   }
}
