import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regulexp {

    public static void main(String[] args) {
        String s = "@Hello @world! #Java$";

        //String s = "123";


        String numreg = "^[a-zA-Z0-9]*$";

        String numreg2 = "^\\d+$";

      //  String numreg3 = "^[^\\d+\\w+]$";

        //String numreg3 = "[^a-zA-Z0-9]+";

        String numreg3 = "\\W";

        Pattern p = Pattern.compile(numreg3);
        Matcher m = p.matcher(s);



        StringBuilder sb=new StringBuilder();

        System.out.println(m.find());

        while (m.find()) {
            sb.append(m.group());
            System.out.println(m.group());

        }

        System.out.println(m.matches());
        System.out.println(sb.toString());
    }
}
