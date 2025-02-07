package K5B10E_Constructors;

public class SubClass extends SuperClass {

   private String subData;

   public SubClass() {
      subData = "-sb-";;
      System.out.println("sub default constructor:   " + this);
   } 

   public SubClass(String supername, String subname) {
      super( supername );
      subData  = subname;
      System.out.println("sub special constructor:   " + this);
   } 
 
   public String toString() {
      return "subData " + subData + ", "+ super.toString();
   } 
}
