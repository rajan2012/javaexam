public class K3B21E_Binary {
   public static void main(String[] args) {
 
      byte a, b = (byte) 1, c;
      a = (byte) Integer.parseInt(args[0]);

      System.out.println("decimal: " + a);

      String binary= "";
      while (true) {
         c = (byte) (a & b);
         if (c != 0) binary = "1" + binary; 
         else        binary = "0" + binary;
         if (b == -128) break;
         b = (byte) (b * 2);
      }
      
      System.out.println ("binary:   "+binary);
   }
}