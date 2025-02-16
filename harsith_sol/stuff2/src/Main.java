//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      String s ="pizza hawai 10.2";

      String[] s2=s.split("\\s+");

      for(String a:s2) {
          System.out.println(a);
      }

      String d=String.join(" ",s2[0],s2[1]);

        System.out.println((Object)d.getClass().getSimpleName());






        }
    }
