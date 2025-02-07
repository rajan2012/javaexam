package K5B06E_Stack_Array;

public class Generic_Stack_Array<T> {

  public Generic_Stack_Array () {}
  
  private int frei, laenge=50; 
  private boolean leer=true, 
                  voll=false;  
  @SuppressWarnings("unchecked")
private T feld [] = 
           (T[]) new Object [laenge];

  public void push
             (T newObj) {
    if ( !voll ) {
      feld [frei++] = newObj;
      leer = false;
      voll = (frei == laenge-1); 
    }  
  }

  public T pop () { 
    if ( !leer ) { 
      frei--;
      T temp = feld[frei];
      voll = false;
      leer = ( frei == 0 ); 
      return temp;  
    } else return null; 
  }

  public boolean isEmpty () { 
    return leer; 
  }

  public boolean isFull () {
    return voll;
  }

  public String toString () { 
    String str = "";
    for (int i = frei-1; 
             i >= 0;
             i--) {
      str += feld[i] + " ";
    }
    return str;
  }
}
