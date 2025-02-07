public class K3B08E_Switch_without_Break {
 public static void main(String[] args) {
  int in = 0, out = 0;
  in = 5;//Integer.parseInt( args[0] );
 
  switch (in) {  
         case 8: 
         case 7: out = out +1 ;
         case 6: out = out +1 ;
         case 5: out = out +1 ; 
         case 4: out = out +1 ;
         case 3: 
         case 2: 
         case 1: 
         case 0: out = out +1 ;
      }

  System.out.println ( "Input: " + in);
  System.out.println ( "Output: " + out);
 }
}
