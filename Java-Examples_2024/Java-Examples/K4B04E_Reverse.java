class K4B04E_Reverse {
/*  reverses the input string    */

 public static void main(String[] args) {
 
   String str = System.console().readLine("input string: ");
   
   String reverse="";
   
//   for  (int index =0; index < str.length(); index++ ) {
//       reverse = str.charAt(index) + reverse;
   
   for (int index=str.length()-1; index>=0; index--)
   {
	   reverse=reverse+str.charAt(index);
   }

   System.out.println( str + " reversed " + reverse );
 }
}
