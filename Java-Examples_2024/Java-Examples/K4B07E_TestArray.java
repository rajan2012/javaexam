public class K4B07E_TestArray {

   static void showArray (int [] anArray) {
      for (int i = 0; i < anArray.length; i++) 
         System.out.println(i + " : " + anArray [i]);
      System.out.println();
   }

   public static void main (String[] args) {
      int [] testArray;

      testArray = new int [5];
      for (int i = 0; i < 5; i++) testArray [i] = i + 1;
      showArray (testArray);

      testArray = new int [] { 11, 22, 33, 44 };
      showArray (testArray);
   }
}
