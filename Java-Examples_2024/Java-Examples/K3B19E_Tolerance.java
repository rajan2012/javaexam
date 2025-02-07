public class K3B19E_Tolerance {
  public static void main(String[] args) {
 
    double x = 1.0, y = 1.0, tolerance = 0.001;

    x = x / 3 * 100000 * 3 / 100000;

    System.out.print ("x: " + x + "\ny: " + y + "\n");
    if (Math.abs (x - y) < tolerance) // absolute value of (x-y)
      System.out.println("x and y are almost equal"); 
    else 
      System.out.println("x and y are probably not equal");
  }
}
