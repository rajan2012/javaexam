package K5B10E_Constructors;

public class SuperClass {

   private String superData;
 
   public SuperClass() {
      superData = "-SP-";
      System.out.println("super default constructor: " + this);
   }
 
   public SuperClass(String name) {
      superData=name ;
      System.out.println("super special constructor: " + this);
   }
 
   public String toString() { 
      return "superData " + superData;
   } 
}
