package K5B07E_SortedList;

public class Elem {

   public Elem () { }
   public Elem (Object obj) { setObject(obj); }
 
   private Object obj; 
   private Elem next;

   public void setObject (Object newObj) {
      obj = newObj; 
   }
   public Object getObject () {
      return obj; 
   }
   public void setNext (Elem nextElem) {
      next = nextElem; 
   }
   public Elem getNext () {
      return next; 
   }
   public String toString () { return obj.toString ();  }
}
