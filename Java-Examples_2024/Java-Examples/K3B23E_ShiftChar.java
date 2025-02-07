public class K3B23E_ShiftChar {
   public static void main(String[] args) {
 
      char ch; 
      short a, b, c, d;
      a = (short) Integer.parseInt(args[0]);

      ch = (char) a;
      b = (short) (ch << 2);
      c = (short) (ch >> 2);
      d = (short) (ch >>> 2);

     System.out.println 
                  ( "a:         " + a 
                + "\nch << 2  : " + b 
                + "\nch >> 2  : " + c 
                + "\nch >>> 2 : " + d);
   }
}
