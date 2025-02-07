public class K3B25E_Rectangle {

  static int wd, ht;

  static int perimeter (int width, int height){
     return 2 * width + 2 * height;
  };
 
  static int area (int width, int height){
     return width * height;
  };

  public static void main(String[] args) {
    int per, ar;

    wd = Integer.parseInt(System.console().readLine("width: "));
    ht = Integer.parseInt(System.console().readLine("height:  "));

    per = perimeter  (wd, ht);
    ar = area (wd, ht);

    System.out.println ("perimeter: " + per + "\narea: " + ar );
    System.exit (0);
  }
} 
