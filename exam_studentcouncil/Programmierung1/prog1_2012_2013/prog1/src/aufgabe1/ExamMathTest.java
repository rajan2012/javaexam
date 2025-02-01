import javax.swing.JOptionPane;

/**
 * @author Peter Birke
 *         birke@uni-trier.de
 *
 * 12.02.2013
 */
public class ExamMathTest {

 public static void main(String[] argv) {
    JOptionPane.showMessageDialog(null, "kgV(15,5):  expected=15,  result=" + ExamMath.kgV(15,5));
    JOptionPane.showMessageDialog(null, "kgV(5,15):  expected=15,  result=" + ExamMath.kgV(5,15));

    JOptionPane.showMessageDialog(null, "kgV(23,35):  expected=805,  result=" + ExamMath.kgV(23,35));
    JOptionPane.showMessageDialog(null, "kgV(21,49):  expected=147,  result=" + ExamMath.kgV(21,49));
    JOptionPane.showMessageDialog(null, "kgV(49,21):  expected=147,  result=" + ExamMath.kgV(49,21));
  }
}

 
