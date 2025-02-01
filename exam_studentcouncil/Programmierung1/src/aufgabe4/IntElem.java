/**
 * @author Peter Birke
 *         birke@uni-trier.de
 *
 * 12.02.2013
 */
public class IntElem {

  private int value;
  private IntElem prev;
  private IntElem next;

  public IntElem(int newValue) {
    value = newValue;
    prev = next = null;
  }

  public int getValue() {
    return value;
  }

  public void setNext(IntElem next) {
    this.next = next;
  }

  public IntElem getNext() {
    return next;
  }

  public void setPrev(IntElem prev) {
    this.prev = prev;
  }

  public IntElem getPrev() {
    return prev;
  }

  public String toString() {
    return super.toString() + "[" + value + "]";
  }
}
