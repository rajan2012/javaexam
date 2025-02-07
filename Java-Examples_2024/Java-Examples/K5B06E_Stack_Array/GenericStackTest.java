package K5B06E_Stack_Array;

public class GenericStackTest {
  public static void main(String[] args) {
    Generic_Stack_Array<Integer> st = new Generic_Stack_Array<Integer>(); 
    while ( true ) {	
      String str = System.console().readLine  
                    ("Eingabe [key|-|0]: ");
      if ( str.equals("0")  ) return;
      if ( str.equals("-") ) {
        int key = st.pop();
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
