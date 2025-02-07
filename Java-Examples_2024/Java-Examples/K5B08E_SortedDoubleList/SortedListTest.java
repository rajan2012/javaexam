package K5B08E_SortedDoubleList;

public class SortedListTest {
  public static void main(String[] args) {
  
    SortedLinkList liste = new SortedLinkList();
    
    while ( true ) {	
      String str = System.console().readLine  
           ("Input [key|-key|0]: ");
      if (str.equals("0")) {
        return;
      } else {
        int key = Integer.parseInt(str);
        if (key > 0) {
          liste.sortIn (new Integer(key));
          System.out.println("Insert: " + key);
          System.out.println("List:   " + liste);
        } else { 
          key = - key;
          liste.delete (liste.lookUp (key));
          System.out.println("Delete: " + key);
          System.out.println("List:   " + liste);
        }
      }
    }
  }
}
