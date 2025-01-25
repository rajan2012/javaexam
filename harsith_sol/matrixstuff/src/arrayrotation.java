




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class arrayrotation {


    public static int[] rotate3(int[] m,int pos) {


       int[] s=new int[m.length];

       int index=0;
        for(int i=pos+1;i<m.length;i++)
        {
           s[index]=m[i];
            index++;
        }

       for(int i=0;i<=pos;i++)
       {
           s[index]=m[i];
           index++;
       }

       return s;


    }

    public static String rotate2(String m,int pos) {

        StringBuilder sb=new StringBuilder();

        sb.append(m.substring(pos,m.length()-1));

        sb.append(m.substring(0,pos-1));

        return sb.toString();


    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //String p=rotate2("sachintendulkar",8);

        int[] a={1,2,3,4,0,4,3,7};

        int[] p=rotate3(a,4);

        for(int i=0;i<p.length;i++) {
            System.out.print(p[i]+" ");
        }
    }
}
