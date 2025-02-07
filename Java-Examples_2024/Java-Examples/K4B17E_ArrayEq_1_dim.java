import java.util.Arrays;
public class K4B17E_ArrayEq_1_dim {
 
   public static void main(String[] args) {

      int [] a = new int [4];
      int [] b = new int [4];
      boolean eq;
      
// wrong:
      eq = (a == b);
      System.out.println("wrong:  equal = " + eq );

// right:
      eq = Arrays.equals (a, b);
      System.out.println("right: equal = " + eq );
   }
}