public class K3B18E_inexact {
   public static void main(String[] args) {
 
      float xf = 1.0f, yf = 1.0f;
      xf = xf / 3 * 100000 * 3 / 100000;  // value = 1, or...? 

      System.out.print ( "xf: " + xf + "\nyf: " + yf + "\n");
      if (xf == yf) System.out.println ("xf and yf are equal");
      else          System.out.println ("xf and yf are not equal");


      double xd = 1.0, yd = 1.0;
      xd = xd / 3 * 100000 * 3 / 100000;  // value = 1, or...? 

      System.out.print ( "xd: " + xd + "\nyd: " + yd + "\n");
      if (xd == yd) System.out.println ("xd and yd are equal");
      else          System.out.println ("xd and yd are not equal");
   }
}
