public class K4B12E_BubbleSort2 {

   public static void sort ( int [] f) {
     for (int i = 1; i < f.length; i++)
         for (int j = 0; j < f.length - i; j++)
            if ( f[j] > f[j+1] ) {
               int t  = f[j];
               f[j]   = f[j+1];
               f[j+1] = t; 
            }
   }
       
   public static void main ( String [] args ) {
      int [] array = new int [args.length];
      for (int i = 0; i < args.length; i++)
         array[i] = Integer.parseInt ( args [i] );
 
      sort (array);

      for (int k = 0; k < array.length; k++) 
          System.out.print(array [k] + " ");
      System.out.println();
   }
}
