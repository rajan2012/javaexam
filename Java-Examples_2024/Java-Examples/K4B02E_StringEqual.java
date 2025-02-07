class K4B02E_StringEqual {
  public static void main(String[] args) {
    String g = "Hello", h = "Hello";
    String i = "Hello" + "", j = h + "";

    System.out.println( "1." + g.equals(h) );
    System.out.println( "2." + g.equals(i) );
    System.out.println( "3." + g.equals(j) );
    System.out.println( "4." +  ( g == h ) );
    System.out.println( "5." +  ( g == i ) );
    System.out.println( "6." +  ( g == j ) );
    System.out.println( "7." +    g == h   );
  }
}
