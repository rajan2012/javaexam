package K5B06E_Stack_Linked;

public class Stack_Linked {
 
  public Stack_Linked ()  {}
  
  private Elem top; 
 
  public void push
             (Object newObj) {
    Elem newElem = 
             new Elem(newObj);
    newElem.setNext(top);
    top = newElem;
  }

  public Object pop () {
    if (top != null) {
      Elem temp = top;
      top = top.getNext();
      return temp.getObject(); 
    }
    else return null;
  }

  public boolean isEmpty () {	  
    return (top == null); 
  }

  public boolean isFull () {
    return false; 
  }

  public String toString () {
    Elem position = top;
    String str = "";
    while (position != null) {
      str += position.
             getObject().           
             toString() + " ";
      position = position.
                 getNext(); 
    }
    return str;
  }
}

