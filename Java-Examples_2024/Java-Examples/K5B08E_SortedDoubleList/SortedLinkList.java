package K5B08E_SortedDoubleList;

public class SortedLinkList {
 
 public SortedLinkList ()  { }     // constructor
 
 private DLElem start; // head of list
 private DLElem end;  // tail of list

 // Determination of sorting order through sorting key:
 public static int getKey(Object obj) { // sorting key
      return  (Integer)obj;    // only for Integer objects
 }

 
 public DLElem lookUp (int keyToLookup)  { 
   DLElem pos = start;
   while ( pos != null ){ 
     if ( getKey(pos.getObject()) == keyToLookup ) 
       return pos;                  // found
     else 
       pos = pos.getNext();  
   }
   return null;                //  not found
  }
 // indentical to single linkage!
  
 //  more methods for list access
 public void sortIn (Object newObj) { 
  int key = getKey(newObj);
  DLElem newElem = new DLElem(newObj);
  if (start == null ) { 
     newElem.setNext (null);
     newElem.setPrev (null);
     start = newElem;  end = newElem;  return; 
  }
  if ( getKey(start.getObject()) > key ) {
     start.setPrev (newElem); 
     newElem.setNext (start);
     newElem.setPrev (null);
     start = newElem;  return; 
  } 
  DLElem pos = start;
  while ( pos.getNext() != null)
     if ( getKey(pos.getNext().getObject()) > key ) { 
        pos.getNext().setPrev(newElem);
        newElem.setNext (pos.getNext());
        newElem.setPrev (pos);
        pos.setNext (newElem);  return; 
     }
     else pos = pos.getNext();
  pos.setNext(newElem);
  end = newElem;
  newElem.setNext(null);
  newElem.setPrev(pos); 
 }

 public void delete (DLElem elemToDelete) { 
   if (elemToDelete == null ) 
     return;
   if (elemToDelete.getPrev() != null)
     elemToDelete.getPrev().setNext(elemToDelete.getNext());
   else
     start = elemToDelete.getNext();
   if (elemToDelete.getNext() != null)
     elemToDelete.getNext().setPrev(elemToDelete.getPrev());   
   else
     end = elemToDelete.getPrev();
 }

 // toString: for debugging list forward and backward...
 public String toString () {
  String str = " ---> ";
  for (DLElem pos = start; pos != null; pos = pos.getNext())
      str += (Integer)pos.getObject() + "  ";
  str += ",  <--- ";
  for (DLElem pos = end; pos != null; pos = pos.getPrev())
      str += (Integer)pos.getObject() + "  ";
  return str;
 }
}
