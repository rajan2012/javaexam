public class K4B21E_StringBufferConstructor
 {
     
   public static void main( String args[] ) {
      StringBuffer buffer1 = new StringBuffer();         
      StringBuffer buffer2 = new StringBuffer( 10 );     
      StringBuffer buffer3 = new StringBuffer( "hello" );
 
      System.out.println(
              "buffer1 = \"" + buffer1.toString() + "\""
         +  "\nbuffer2 = \"" + buffer2.toString() + "\""
         +  "\nbuffer3 = \"" + buffer3.toString() + "\"");
   }
}
