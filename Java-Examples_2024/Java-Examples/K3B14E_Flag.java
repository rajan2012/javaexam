public class K3B14E_Flag {
   public static void main(String[] args) {
 
      int i, j, flagSize;
      flagSize = Integer.parseInt(
            //System.console().readLine("Size of the flag: ")
    		  args[0]);

      for (i = 1; i <= flagSize; i++) {
    	 System.out.print("|");
         for (j = 1; j <= flagSize; j++)
         {
            if (i == j || (flagSize +1 - j) == i)
               System.out.print("xxx");
            else
               System.out.print("   ");
         }
         System.out.println("|");
      }
    }
}