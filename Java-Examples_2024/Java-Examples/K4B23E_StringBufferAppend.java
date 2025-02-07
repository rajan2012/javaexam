public class K4B23E_StringBufferAppend {
   public static void main( String args[] ){
 
      String str = "7 ";  
      int intVal = 4;
      double floatVal = 11.0f;
      boolean boolVal = true;
      StringBuffer aBuffer = new StringBuffer( ", that's " );
 
      StringBuffer buffer = new StringBuffer();
 
      buffer.append(str);
      buffer.append("+ ");
      buffer.append(intVal).append(" = ");

      System.out.println( buffer.toString() 
                        + "\ncapacity: " + buffer.capacity() );

      buffer.append(floatVal).append(aBuffer).append(boolVal);           
      System.out.println( buffer.toString() 
                        + "\ncapacity: " + buffer.capacity() );
   }
 }
