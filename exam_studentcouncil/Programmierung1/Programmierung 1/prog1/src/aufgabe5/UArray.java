import java.util.Arrays;

/**
 * @author Peter Birke
 *         birke@uni-trier.de
 *
 * 12.02.2013
 */
public class UArray {

  private int[] internalArray;
  private int size;

  public UArray(int initCapacity) {
    internalArray = new int[initCapacity];
    size = 0;
  }

  void ensureCapacity() {
    // TODO: Implementieren
  }

  public void add(int arg) {
    ensureCapacity();
    internalArray[size++] = arg;
  }

  // TODO Weitere Methoden ergaenzen
}
