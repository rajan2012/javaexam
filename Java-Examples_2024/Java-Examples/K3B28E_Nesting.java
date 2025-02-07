public class K3B28E_Nesting {

   static int max (int a, int b)  {
      return a > b ? a : b;
   }

   static int max3 (int c, int d, int e)  {
      return max (c, max (d, e) );	  
   }

   public static void main(String[] args) {

      int x, y, z;
      x = Integer.parseInt (args[0]); 
      y = Integer.parseInt (args[1]);
      z = Integer.parseInt (args[2]);

      System.out.println("Maximum: " + max3 (x, y, z) );
      
   }
}
