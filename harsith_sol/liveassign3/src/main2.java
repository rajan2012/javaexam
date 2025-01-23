//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main2 {

    public static String abbreviateName(String name)
    {
        String[] s=name.split(" ");

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length-1;i++)
        {
            sb.append(s[i].charAt(0)).append(". ");
        }

        sb.append(s[s.length-1]);

        return sb.toString();
    }

    public static void main(String[] args) {

        // int[] a=new int[5, 6, 7, 8, 9, 0, 1, 2, 3, 4];

        int[] a={5, 6, 7, 8, 9, 0, -1, 2, 9, 4};


            String s2 = abbreviateName("Edgar Allan Poe");
            System.out.println(s2);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}