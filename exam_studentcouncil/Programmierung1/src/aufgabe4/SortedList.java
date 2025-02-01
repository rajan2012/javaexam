/**
 * @author Peter Birke
 *         birke@uni-trier.de
 *
 * 12.02.2013
 */
public class SortedList {

  private IntElem start;
  private IntElem ende;

  public SortedList(int[] values) {
    start = null;
    ende  = null;

    for (int i=0; i<values.length; i++) {
      add(values[i]);
    }
  }

  public void add(int valueToInsert) {
    // TODO Implementieren
  }

  protected IntElem getPrev(int valueToInsert) {
    // TODO Implementieren
  }

  public String toString() {
    String res = "[ ";
    IntElem iter = start;
    while (iter != null) {
      res += iter.getValue() + "  "; 
      iter = iter.getNext();
    }
    res += "]";
    return res;
  }
}
