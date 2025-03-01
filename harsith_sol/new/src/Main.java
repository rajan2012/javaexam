//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        String s1="racecar";

        int s=0;
        int e=s1.length()-1;

        for(int i=0;i<s1.length()/2;i++)
        {
            if(s1.charAt(s)==s1.charAt(e))
            {
                s++;
                e--;
            }
        }

        String s2=s1.substring(s,e+1);



        System.out.println(s2);
    }
}