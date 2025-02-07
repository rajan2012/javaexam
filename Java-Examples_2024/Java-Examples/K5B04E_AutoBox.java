public class K5B04E_AutoBox {

   public static void main (String args[]) {

      int i = 54286;
      Integer iObj = new Integer (i);
      Integer jObj = new Integer (i);

      if (i == iObj)
        System.out.println( "i = iObj = " + iObj + " (values!)\n");

      if (jObj != iObj)
        System.out.println( "jObj != iObj (references!)\n");

      i = iObj / 2;
      System.out.println( "iObj / 2 = " + i + " (Auto-Unboxing)");

   }
}
