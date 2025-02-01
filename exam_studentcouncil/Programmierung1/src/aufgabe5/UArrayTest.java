import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 * @author Peter Birke
 *         birke@uni-trier.de
 *
 * 12.02.2013
 */
public class UArrayTest {

  public static void main(String[] argv) {
    UArray a = new UArray(4);
    for (int i=0; i<17; i++)
      a.add(i);
    JOptionPane.showMessageDialog(null, "SIZE(EXPECTED:17)=" + a.getSize() + " CAPACITY(EXPECTED:32)=" + a.getCapacity());

    for (int i=18; i<20; i++)
      JOptionPane.showMessageDialog(null, "INDEXOF(" + i + ")[EXPECTED:-1]=" + a.indexOf(i));

    JOptionPane.showMessageDialog(null, "INDEXOF(11)[EXPECTED:11]=" + a.indexOf(11));

    int[] b = new int[10];
    for (int i=0; i<10; i++)
      b[i] = a.get(i);

    JOptionPane.showMessageDialog(null, "Ersten 10 Elemente [EXPECTED:0 1 2 3 4 5 6 7 8 9] = " + Arrays.toString(b));

    try {
      a.get(20);
      JOptionPane.showMessageDialog(null, "get(20) sollte eigentlich eine IndexOutOfBoundsException werfen");
    }
    catch (IndexOutOfBoundsException e) {
      JOptionPane.showMessageDialog(null, "get(20) wirft korrekterweise eine IndexOutOfBoundsException");
    }
  }
}
