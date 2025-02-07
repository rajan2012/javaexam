public class K4B11E_BubbleSort {
  public static void main(String[] args) {
 
    char [] chArray = "one_String".toCharArray();//args[0].toCharArray();
    System.out.println ( 0 + ": " + new String(chArray) );
 
    for (int i = 1; i < chArray.length; i++){
      for (int j = 0; j < chArray.length - i; j++)
        if ( chArray [j] > chArray [j+1]) {
          char help = chArray [j]; 
          chArray [j] = chArray [j+1];
          chArray [j+1] = help; 
        }
      System.out.println ( i + ": " + new String(chArray) );
    }  

  }
}
