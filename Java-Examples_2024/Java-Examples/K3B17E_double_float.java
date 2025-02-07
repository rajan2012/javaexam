public class K3B17E_double_float {
  public static void main(String[] args) {
    float  xf;
    double xd;

    xf = 123456.78901234567890f;
    xd = 0.012345678901234567890d;

    System.out.println( xf );
    System.out.println( xd );
    System.out.println( 0.12345e-5 );
    System.out.println( 1.0e200 * 1.0e200 );
    System.out.println( 1.0  / 0.0 );
    System.out.println( -1.0 / 0.0 * 2);
    System.out.println( 0.0  / 0.0 );
  }
}

