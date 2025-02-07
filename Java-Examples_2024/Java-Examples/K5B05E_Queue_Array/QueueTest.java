package K5B05E_Queue_Array;

public class QueueTest {
  public static void main(String[] args) {
    Queue_Array qu = new Queue_Array ();
    while ( true ) {	
      String str = System.console().readLine  
                    ("Input [key|-|0]: ");
      if ( str.equals("0")  ) return;
      if ( str.equals("-") ) {
        int key = (Integer)qu.deQueue();
        System.out.println("deQueue: " + key);
        System.out.println("Queue:   " + qu);
      } else { 
        int key = Integer.parseInt(str);
        qu.enQueue (key);
        System.out.println("enQueue: " + key);
        System.out.println("Queue:   " + qu);
      }
    }
  }
}
