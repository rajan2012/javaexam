public class K4B05E_StringValueOf {

   public static void main( String args[] ) {
//	      char charArray[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
	      int charArray[] = { 123,456 };
      boolean booleanValue = true;
      char characterValue = 'Z';
      int integerValue = 7;
      long longValue = 10000000L;
      float floatValue = 2.5f;
      double doubleValue = 33.333;

      System.out.println(
          "char array: " + String.valueOf( charArray ) +
        "\nboolean:    " + String.valueOf( booleanValue ) +
        "\nchar:       " + String.valueOf( characterValue ) +
        "\nint:        " + String.valueOf( integerValue ) +
        "\nlong:       " + String.valueOf( longValue ) + 
        "\nfloat:      " + String.valueOf( floatValue ) + 
        "\ndouble:     " + String.valueOf( doubleValue ) );
 }
}
