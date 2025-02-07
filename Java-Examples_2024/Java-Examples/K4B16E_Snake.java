import java.util.Arrays;
public class K4B16E_Snake{
   public static char [][] image;

   public static void repaint(){
      for (int row=0; row< image.length; row++) 
         System.out.println(new String(image[row]));
      System.out.println();
      
      try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
   }

   public static void main(String[] args) {
      if (args.length != 3) {
	System.out.println("call: java K4B16E_Snake "
                         + "width height length");
        return;
      }

      int width = Integer.parseInt(args[0]);
      int height  = Integer.parseInt(args[1]);
      int length = Integer.parseInt(args[2]);
      image = new char [height][width];

      for (int row=0; row< height; row++)
         Arrays.fill (image[row],' ');

      int xa=0, ya=0, dxa=1,dya=1;
      int xe=0, ye=0, dxe=1,dye=1;

      while (true) {
	  image[ya][xa]='W';
 	  repaint();
 	  image[ya][xa]='#';
          xa = xa + dxa; if (xa>=width-1 || xa<=0) dxa = -dxa;
          ya = ya + dya; if (ya>=height-1  || ya<=0) dya = -dya;
          if (length > 0) { 
            length --; 
	  } else {
            image[ye][xe]=' ';
	    xe = xe + dxe; if (xe>=width-1 || xe<=0) dxe = -dxe;
            ye = ye + dye; if (ye>=height-1  || ye<=0) dye = -dye;
          }
      }
   }
}
