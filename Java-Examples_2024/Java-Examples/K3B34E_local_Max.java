public class K3B34E_local_Max {

  static int max (int x, int y)  {
    return x > y ? x : y;
  }

  public static void main(String[] args) {

    System.out.println (
           "Maximum: " + max (3, 7)      + " (local method!)"
       + "\nMaximum: " + Math.max (3, 7) + " (Math.max)"
    );
  }
}
