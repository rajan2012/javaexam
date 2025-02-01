import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Peter Birke
 *         birke@uni-trier.de
 *
 * 12.02.2013
 */
public class ProjectTest {

  public static void main(String[] argv) {
    List<Project> projects = new ArrayList<Project>();
    projects.add(new Project(" Datenbank installieren und konfigurieren"));
    projects.add(new Project(" Konfiguration testen"));
    projects.add(new Project("Testfaelle evaluieren "));
    projects.add(new Project(" Datenbank wieder verwerfen  "));

    JOptionPane.showMessageDialog(null, "Umkehrung=" + projects.get(0).reverse() + " erwartet=knabnetaD nereillatsni dnu nereirugifnok");
    JOptionPane.showMessageDialog(null, "Umkehrung=" + projects.get(1).reverse() + " erwartet=noitarugifnoK netset");
    JOptionPane.showMessageDialog(null, "Umkehrung=" + projects.get(2).reverse() + " erwartet=elleaftseT nereiulave");
    JOptionPane.showMessageDialog(null, "Umkehrung=" + projects.get(3).reverse() + " erwartet=knabnetaD redeiw nefrewrev");
  }
}
