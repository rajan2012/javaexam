import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int[][] createArray2(int[] a) {
        if (a == null || a.length == 0) {
            return new int[0][];
        }
        int[][] result = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                // Ignore negative sizes (could also throw an error)
                result[i] = new int[0];
            } else {
                result[i] = new int[a[i]]; // Initialize inner arrays with a[i] size
            }
        }
        return result;
    }

    public static int[][] createarray(int[] a)
    {
        int row=a.length;
        int[][] m=new int[row][];

        int col=0;
        for(int i=0;i<a.length;i++)
        {


            m=new int[row][a[i]];
        }

        return m;

    }

    public static int countuniq(String s)
    {
        Map<String,Integer> m=new HashMap<>();

        Set<String> s1=new HashSet<>();

        String[] s2=s.toLowerCase().split(" ");

        for(String b:s2)
        {
            s1.add(b);
        }

        for(String b:s2)
        {
            m.put(b,m.getOrDefault(b,0)+1);
        }
        int cnt=0;
        for(String c:m.keySet())
        {
            System.out.println(c+" "+m.get(c));
            if(m.get(c)==1)
            {
                cnt++;
            }
        }

        return m.size();
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
   // int n=countuniq("this This is is is fun");

        int[] a={1,2,4,3,2};
        int[][] m2=createArray2(a);



    System.out.println(m2);
    }
}