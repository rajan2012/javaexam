//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main2 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String s="banana";

        StringBuilder sb=new StringBuilder();

        int[] ch =new int[26];

        for(char c:s.toCharArray())
        {
            ch[c-'a']++;
            if(ch[c-'a']==2)
            {
                sb.append('x');
            }
            else
            {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());




    }
}