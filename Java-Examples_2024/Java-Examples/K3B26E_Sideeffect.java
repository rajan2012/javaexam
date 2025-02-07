public class K3B26E_Sideeffect {

   static int x,y;

   static void swap ()  {
      int help;
      help = x;   // x and y are global !
      x = y;
      y = help;
   }

   public static void main(String[] args) {

      x = 2;//Integer.parseInt(System.console().readLine("x: "));
      y = 7;//Integer.parseInt(System.console().readLine("y: "));


      System.out.println("Before:  x= " + x + "  y= " + y );

      swap ();

      System.out.println("After: x= " + x + "  y= " + y );
   }
}
