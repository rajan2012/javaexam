class K4B01E_StringLength {

 public static void main (String[] args) {

  String st1 = "a String";
  String st2 = "another String";

  System.out.println("\"" + st1 + "\": length " + st1.length () ); 
  System.out.println("\"" + st2 + "\": length " + st2.length () ); 
  st2 = st1;
  System.out.println("\"" + st2 + "\": length " + st2.length () ); 
 }
}
