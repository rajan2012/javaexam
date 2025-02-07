public class K5B02E_Rectangle {

   static int count;

   private int xPos, yPos, width, height;

   K5B02E_Rectangle () { count++; }
 
   K5B02E_Rectangle (int x, int y, int w, int h) { 
      setPosition (x, y); setSize (w, h); count++; }
 
   static int getCount () { return count;}
 
   int getxPos ()   { return xPos;} 
   int getyPos ()   { return yPos;}  
   int getWidth () { return width;} 
   int getHeight  () { return height;} 

   void setPosition (int x, int y) { xPos = x; yPos = y; }

   void setSize (int b, int h) { width = b; height = h;}
 
   int area () { return width * height; }
   int perimeter () { return 2 * ( width + height); }
}
