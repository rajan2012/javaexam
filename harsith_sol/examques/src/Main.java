import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static boolean ana(String s,String s1)
    {
        List<Character> s2=new ArrayList<>();

        for(char c:s1.toCharArray())
        {
            s2.add(c);
        }

        for(char c2:s.toCharArray())
        {
            if(!s2.contains(c2))
            {
                System.out.println("not anagram");
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       String s="this";

       String s1="hits";

      boolean f=ana(s,s1);

      System.out.println("flag is "+f);

    }
}