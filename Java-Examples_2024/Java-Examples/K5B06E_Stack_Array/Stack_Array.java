package K5B06E_Stack_Array;

public class Stack_Array {

  public Stack_Array () {}
  
  private int free, length=50; 
  private boolean empty=true, 
                  full=false;  
  private Object array [] = 
           new Object [length];

  public void push
             (Object newObj) {
    if ( !full ) {
      array [free++] = newObj;
      empty = false;
      full = (free == length-1); 
    }  
  }

  public Object pop () { 
    if ( !empty ) { 
      free--;
      Object temp = array[free];
      full = false;
      empty = ( free == 0 ); 
      return temp;  
    } else return null; 
  }

  public boolean isEmpty () { 
    return empty; 
  }

  public boolean isFull () {
    return full;
  }

  public String toString () { 
    String str = "";
    for (int i = free-1; 
             i >= 0;
             i--) {
      str += array[i] + " ";
    }
    return str;
  }
}
