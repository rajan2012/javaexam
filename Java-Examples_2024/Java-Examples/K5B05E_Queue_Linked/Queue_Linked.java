package K5B05E_Queue_Linked;

public class Queue_Linked {

 public Queue_Linked ()  {} 

 private Elem start, end;

 public void enQueue 
             (Object newObj) {
  Elem newElem = new Elem(newObj);
  if (start == null) 
    start = newElem;
  else 
    end.setNext (newElem);  
  end = newElem; 
 }

 public Object deQueue () {
  if (start != null) {
   Elem temp = start;
   start = start.getNext();
   if (start == null) 
      end = null;
   return temp.getObject(); 
   }
  else return null;
 }

 public boolean isEmpty () {
  return (start == null);
 }

 public boolean isFull () {
  return false;
 }

 public String toString () { 
  Elem position = start;
  String str = "";
  while (position != null) { 
   str += position.getObject()
          .toString() + "  ";
   position = position.getNext(); 
  }
 return str;
 }
}
