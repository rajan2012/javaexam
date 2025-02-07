package K5B06E_Stack_Linked;

import K5B06E_Stack_Array.Stack_Array;

public class StackTest {
  public static void main(String[] args) {
    Stack_Array st = new Stack_Array(); 
    while ( true ) {	
      String str = System.console().readLine  
                    ("Input [key|-|0]: ");
      if ( str.equals("0")  ) return;
      if ( str.equals("-") ) {
        int key = (Integer)st.pop();
        System.out.println("pop:   " + key);
        System.out.println("Stack: " + st);
      } else { 
        int key = Integer.parseInt(str);
        st.push(key);
        System.out.println("push:  " + key);
        System.out.println("Stack: " + st);
      }
    }
  }
}
