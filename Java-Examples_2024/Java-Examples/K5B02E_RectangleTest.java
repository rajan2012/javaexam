class K5B02E_RectangleTest {
   public static void main(String[] args) {

      K5B02E_Rectangle r1 = new K5B02E_Rectangle ();
      r1.setSize (4, 12);

      K5B02E_Rectangle r2 
                 = new K5B02E_Rectangle (3, 5, 12, 19);

      System.out.println(         
   "Rectangle r1:"
 + "\nx     = " + r1.getxPos()   + ", y        = " + r1.getyPos()
 + "\nwidth = " + r1.getWidth()  + ", height   = " + r1.getHeight() 
 + "\narea  = " + r1.area()      + ", perimeter= " + r1.perimeter()
 + "\n\n" +
   "Rectangle r2:"
 + "\nx     = " + r2.getxPos()   + ", y        = " + r2.getyPos()
 + "\nwidth = " + r2.getWidth()  + ", height   = " + r1.getHeight() 
 + "\narea  = " + r2.area()      + ", perimeter= " + r2.perimeter()
 + "\n\n"+
   "generated objects: " + K5B02E_Rectangle.getCount ());
    }
}