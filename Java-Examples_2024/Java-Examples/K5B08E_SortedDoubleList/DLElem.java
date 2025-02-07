package K5B08E_SortedDoubleList;

public class DLElem {

   private Object obj;  // data
   private DLElem next; // reference to next element
   private DLElem prev; // reference to previous element

   public DLElem () {}

   public DLElem (Object obj) {
      setObject(obj);
   }
 
   public void setObject (Object newObj) {
      obj = newObj; 
   }
   public Object getObject () {
      return obj; 
   }

   public void setNext (DLElem nextElem) {
      next = nextElem; 
   }

   public void setPrev (DLElem prevElem) {
      prev = prevElem; 
   }

   public DLElem getNext () { return next; }

   public DLElem getPrev () { return prev; }

   public String toString () { return obj.toString ();  }

}
