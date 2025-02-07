public class K3B22E_ShiftInt {
   public static void main(String[] args) {
 
      int a, b, c, d;
      a = Integer.parseInt(args[0]);

      b = a << 2;
      c = a >> 2;
      d = a >>> 2;

      System.out.println 
                   ("a:       " + a 
                + "\na << 2:  " + b 
                + "\na >> 2:  " + c 
                + "\na >>> 2: " + d);
   }
}
