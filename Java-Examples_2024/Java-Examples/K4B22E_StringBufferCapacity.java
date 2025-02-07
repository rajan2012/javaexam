public class K4B22E_StringBufferCapacity {
  public static void main( String args[] ){
 
   StringBuffer buffer = new StringBuffer( "testing a buffer" );

   System.out.println
             ("buffer =      " + buffer.toString()
          + "\nlength =      " + buffer.length()
          + "\ncapacity =    " + buffer.capacity() );
 
   buffer.ensureCapacity( 50 );
   System.out.println
          ("\nnew capacity = " + buffer.capacity());
 
   buffer.setLength( 7 );
   System.out.println
          ("\nnew length =   " + buffer.length() 
         + "\nbuffer=        " + buffer.toString()
         + "\ncapacity =     " + buffer.capacity());
  }
 }
