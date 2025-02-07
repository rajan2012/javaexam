package K5B05E_Queue_Array;

public class Queue_Array {

 public Queue_Array () {}
 
 private int start, free, 
             length = 50; 
 private boolean empty = true, 
                 full = false;     
 private Object array []
         = new Object [length];
 
 public void enQueue
             (Object newObj) { 
  if ( !full ) { 
    array [free] = newObj;
    free = (free + 1) % length;
    empty = false;
    full = ( start == free ); 
  }  
 }


 public Object deQueue () { 
  if ( !empty ) { 
   Object temp = array [start];
   start = (start + 1) % length;
   full = false;
   empty = ( start == free );
   return temp;  
  }
   else return null; 
 }

 public boolean isEmpty () { 
  return empty; 
 }

 public boolean isFull () {
  return full;
 }

 public String toString () { 
  String str = "";
  int i = start;
  if (!empty)
   do { 
    str += array [i] + "  ";
    i = (i + 1) % length; 
   }
   while (i != free);
   return str;
 }
    
}    
