public class K3B33E_Overloading {
   public static void main (String[] args) {

   double db = -6.12345678908642;
   float fl  = -6.1234567F;
   long lg   = -12345678908642L;
   int in    = -12345678;

   System.out.println( 
         "abs (db) = " + Math.abs ( db )                      
     + "\nabs (fl) = " + Math.abs ( fl ) 
     + "\nabs (lg) = " + Math.abs ( lg )
     + "\nabs (in) = " + Math.abs ( in ) );
  }
}
