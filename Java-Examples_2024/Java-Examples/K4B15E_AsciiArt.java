import java.util.Arrays;
public class K4B15E_AsciiArt {
   public static char [][] image;

   public static void repaint(){
      for (int row=0; row< image.length; row++) 
         System.out.println(new String(image[row]));
      System.out.println();
//     if ( ! "".equals(System.console().readLine("\n\n")))
//         System.exit(0);
      try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
   }

   public static void main(String[] args) {
      int breite = Integer.parseInt(args[0]);
      int hoehe  = Integer.parseInt(args[1]);
      image = new char [hoehe][breite];

      for (int zeile=0; zeile< hoehe; zeile++)
         Arrays.fill (image[zeile],'.');

      int x=0, y=0;
      while (true) {
          image[y][x]='X';
          repaint();
          x = (x + 1) % breite;
          y = (y + 1) % hoehe;
      }
   }
}
