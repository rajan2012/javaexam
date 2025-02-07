public class K3B20E_Increment {
   public static void main(String[] args) {

      int x = 0, count = 0;
      ++count; 
      x = 5*(count++)  + count--;   // allowed, but bad style....

      System.out.println("x: " + x + "  count: "+count);
   }
}
