class K4B19E_ArrayTests {

  static String atos (int[][] array, String arrayName) {
    String output = arrayName + ":\n";
    for (int i = 0; i < array.length; i++) {
      output += "[";
      for (int j = 0; j < array[i].length; j++) {
        output += " " + array[i][j] + " ";
      }
      output += "]\n";
    }
    return output;
  }

  public static void main(String[] args) {
     int [] [] a = { {22, 45, 57, 33}, {64, 28, 19},
                  {}, {97}, {88, 73, 44, 35, 84} };

     int [] [] b = new int [5][];

     for (int i = 0; i < a.length; i++)
        b [i] = a [i];

     a [1][1] = 0;

     System.out.println( atos(a, "array a") );
     System.out.println( atos(b, "array b") );

     int [] [] c = { {22, 45, 57, 33}, {64, 28, 19},
                  {}, {97}, {88, 73, 44, 35, 84} };

     int [] [] d = new int [5][];

     for (int i = 0; i < c.length; i++)
         d [i] = (int[]) c[i].clone();

     c [1][1] = 0;

     System.out.println( atos(c, "array c"));
     System.out.println( atos(d, "array d"));
  }
}