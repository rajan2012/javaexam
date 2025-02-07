package K5B10E_Constructors;

public class Test {
 
   public static void main( String args[] ) {

      System.out.println("generating instance of superclass");
      SuperClass a = new SuperClass ("-AA-");
      System.out.println();
      
      System.out.println("generating instance of subclass with default constructor");
      SubClass   b = new SubClass   ();
      System.out.println();
      
      System.out.println("generating instance of subclass with special constructor");
      SubClass   c = new SubClass   ("-C1-","-C2-");
      System.out.println();
      
      a = null;  // marked for Garbage Collection
      b = null;  //                -  "  -
      c = null;  //                -  "  -

      System.gc();  // call Garbage Collector
   }
}
