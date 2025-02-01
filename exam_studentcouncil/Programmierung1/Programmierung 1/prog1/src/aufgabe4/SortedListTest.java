import javax.swing.JOptionPane;

/**
 * @author Peter Birke
 *         birke@uni-trier.de
 *
 * 12.02.2013
 */
public class SortedListTest {

  public static void main(String[] argv) {
    int[] values = {3, 2, 5, 7, 8, 10, 1};
    SortedList list2 = new SortedList(values);
    JOptionPane.showMessageDialog(null, "TESTE getPrev - Ausgangspunkt: " + list2);
    for (int i=0; i<14; i++) {
      JOptionPane.showMessageDialog(null, list2 + " getPrev(" + i + ")=" + list2.getPrev(i));
    }

    SortedList list = new SortedList(new int[]{});

    JOptionPane.showMessageDialog(null, "TESTE add - Ausgangspunkt: " + list);
    list.add(3);
    JOptionPane.showMessageDialog(null, "In leere Liste einfuegen: " + list);

    list.add(12);
    JOptionPane.showMessageDialog(null, "Am Ende einfuegen: " + list);

    list.add(6);
    JOptionPane.showMessageDialog(null, "In der Mitte einfuegen: " + list);

    list.add(9);
    JOptionPane.showMessageDialog(null, "In der Mitte einfuegen: " + list);

    list.add(18);
    JOptionPane.showMessageDialog(null, "Am Ende einfuegen: " + list);

    list.add(1);
    JOptionPane.showMessageDialog(null, "Am Anfang einfuegen: " + list);
  }
}
