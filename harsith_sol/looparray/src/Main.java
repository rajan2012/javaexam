//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] a = {1, 4, 0, 3, 2};

        int count=0;

        boolean[] visited=new boolean[a.length];

        for(int i=0;i<a.length;i++)
        {
            if(!visited[i]) {
                int index = i;
                while (!visited[index]) {
                    visited[index] = true;
                    index = a[index];
                   // break;
                }
                System.out.println("i is "+ i+ " count is "+count);
                count++;
            }

        }

        System.out.println(count);
    }
}