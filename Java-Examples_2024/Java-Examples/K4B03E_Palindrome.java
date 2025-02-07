class K4B03E_Palindrome {
/*  tests if a given string is a palindrome  */

 public static void main(String[] args) {
   
   String str = System.console().readLine
            ("input test string: ");
      
   int left, right;
   for ( left = 0, right = str.length () - 1; 
         left < right;
         left++, right --) {
      if ( str.charAt (left) != str.charAt (right) ) break;
   }

   System.out.println("palindrome " +(left >= right) );
  }
}
