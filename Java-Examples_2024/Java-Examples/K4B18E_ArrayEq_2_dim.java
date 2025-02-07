import java.util.Arrays;
public class K4B18E_ArrayEq_2_dim {
   public static void main(String[] args) {

      int [][] a = new int [4][5];
      int [][] b = new int [4][5];
      boolean eq;

// wrong:
      eq = Arrays.equals (a, b);
      System.out.println("wrong:  equal = " + eq );

// richtig:
      eq = true;
      if ( a.length != b.length ) {
      eq = false;
      } else { 
        for (int i = 0; i < a.length; i++) 
          if ( !Arrays.equals ( a[i], b[i]) ) {
            eq = false; 
            break;
          }
      }
      System.out.println("right: equal = " + eq );
   }
}
