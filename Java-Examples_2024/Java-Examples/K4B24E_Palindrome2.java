public class K4B24E_Palindrome2 {

// remove white spaces, punctuation, etc.
   static String removeJunk(String str) {
      int len = str.length();
      StringBuffer dest = new StringBuffer(len);
      char c;
      for (int i = 0; i < str.length(); i++) {
         c = str.charAt(i);
         if (Character.isLetterOrDigit(c)) {
            dest.append(c);
         }
      }
      return dest.toString();
   }

// generate a reversed String
  static String reverse(String string) {
      StringBuffer sb = new StringBuffer(string);
         return sb.reverse().toString();
   }

// Test if palindrome (ignoring upper and lower case)
  static boolean isPalindrome(String stringToTest) {
      String workingCopy  = removeJunk(stringToTest);
      String reversedCopy = reverse(workingCopy);
      return reversedCopy.equalsIgnoreCase(workingCopy);
   }

   public static void main(String[] args) {
      String testString = "Otto #";//System.console().readLine 
//                                ("input test string: ");

      System.out.println("palindrome: " + 
                               isPalindrome(testString) ); 
  }
}
