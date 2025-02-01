public class A3a {
  public static int f( int[] data, int value ) {

    if ( data == null ) throw new IllegalArgumentException();

    int i = data.length - 1;

    while (i != 0 ) {
        i--;
        if ( data[i] == value ) return 0;
    }
    return 1;
  }

}
