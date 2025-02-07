package K5B07E_SortedList;

public class SortedList {

   public SortedList ()  { }  //constructor

   private Elem start;  // anchor of the list

   // methods for list access:
   public static int getKey(Object obj) { // sorting key
      return  (Integer)obj;    // only for Integer objects
   }

   public Elem lookUp (int keyToLookup)  { 
      Elem pos = start;
      while ( pos != null ){ 
         if ( getKey(pos.getObject()) == keyToLookup ) 
            break;                  // found
         else if (getKey(pos.getObject()) > keyToLookup)
        	 pos=null;
         else 
            pos = pos.getNext();  
      }
      return pos;                //  not found
   }

   public void sortIn (Object newObj) { 
     int key = getKey(newObj);
     Elem newElem = new Elem(newObj);
     if (start == null ) { 
        newElem.setNext (null);
        start = newElem; 
        return; 
     }
     if (getKey(start.getObject()) > key ) { 
        newElem.setNext (start);
        start = newElem;
        return; 
     }
     Elem pos = start;
     while ( pos.getNext() != null)
        if (getKey(pos.getNext().getObject()) > key) { 
        newElem.setNext (pos.getNext());
        pos.setNext (newElem);
        return; 
     } else 
        pos = pos.getNext();
     pos.setNext(newElem);
     newElem.setNext(null); 
   }

   public void delete (Elem elemToDelete) { 
      if (start == null || elemToDelete == null) 
         return;
      if (start == elemToDelete) { 
         start = elemToDelete.getNext(); 
         return; 
      }
      Elem pos = start;
      while ( pos.getNext() != null )
         if ( pos.getNext() == elemToDelete ) { 
            pos.setNext(elemToDelete.getNext()); 
         return; 
         }
         else 
            pos = pos.getNext();
   }

   public String toString () { 
      String str = "";
      for (Elem pos = start; pos != null; pos = pos.getNext()) 
         str += (Integer)pos.getObject() + "  ";
      return str;
   }
}
