public class K3B24E_BitOp {
   public static void main(String[] args) {
 
      int i = 3, j = 2;
      if ((++i < ++j) && (i++ > j++)) 
         {} 
      else 
         System.out.println("&& : i: " + i + " j: " + j);

      i = 3; j = 2;
      if ((++i < ++j) & (i++ > j++)) 
         {} 
      else 
         System.out.println("&  : i: " + i + " j: " + j);
   }
}
