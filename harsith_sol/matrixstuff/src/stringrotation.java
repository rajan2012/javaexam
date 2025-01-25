

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class stringrotation {


    public static String rotate3(String m,int pos) {


        String n="";


            n=n.concat(m.substring(pos,m.length()-1)).concat(m.substring(0,pos-1));


        return n;


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

        String p=rotate3("sachintendulkar",8);

        System.out.println(p);


    }
}