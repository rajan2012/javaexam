public class K4B13E_Matrix {
   public static void main(String[] args) {
 
      int n = Integer.parseInt ( args [0] );
      int m = Integer.parseInt ( args [1] );

      int [][] matrix = new int [n] [m];		
      for ( int i = 0; i < matrix.length; i++ )		
         for ( int j = 0; j < matrix[i].length; j++ )
            matrix[i][j] =10000+ i*100+j;  

      for ( int i = 0; i < matrix.length; i++ )  {		
         for ( int j = 0; j < matrix[i].length; j++ )
             System.out.print(matrix[i][j] + "  ");
         System.out.println();
      }
   }
}
