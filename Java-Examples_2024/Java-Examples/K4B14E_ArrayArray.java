public class K4B14E_ArrayArray {
   public static void main(String[] args) {
      int [] [] array = {
              {22, 45, 57, 33},
              {64, 28, 19},
              {},
              {97},
              {88, 73, 44, 35, 84}
       };

      System.out.println("number of rows: "+ array.length);
      for ( int i = 0; i < array.length; i++ ) {
         System.out.print(i + " [" + array[i].length + "] : "); 
         for ( int j = 0; j < array[i].length; j++ ) 
            System.out.print(array [i][j] + "  ");
         System.out.println();
       }
   }
}
