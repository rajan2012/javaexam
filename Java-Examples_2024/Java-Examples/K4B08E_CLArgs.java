public class  K4B08E_CLArgs {
   public static void main( String args[] ) {
      int  result;
      int  arg1 = Integer.parseInt ( args [ 0 ] );
      char arg2 = args[1].charAt(0);
      int  arg3 = Integer.parseInt ( args [ 2 ] );
      switch (arg2) {
      	 case '+': result = arg1 + arg3; break;
      	 case '-': result = arg1 - arg3; break;
      	 case '*': result = arg1 * arg3; break;
      	 default : result = 0;
      }
      System.out.println(arg1 + " " + arg2 + " " + arg3 + " = " + result);
   }
}
