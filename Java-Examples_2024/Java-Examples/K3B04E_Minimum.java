public class K3B04E_Minimum {
   public static void main(String[] args) {
 
   int num1, num2, num3, min;
 
   num1 = Integer.parseInt(args[0]);
   num2 = Integer.parseInt(args[1]);
   num3 = Integer.parseInt(args[2]);
 
   if (num1 < num2) 
      if (num1 < num3) min = num1;
      else min = num3;
   else
      if (num2 < num3) min = num2;
      else min = num3;

   System.out.println("Minimum: " + min);
   }
}
