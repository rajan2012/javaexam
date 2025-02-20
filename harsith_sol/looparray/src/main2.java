//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main2 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] a =  {1, 2, 3, 4, 5};

        int count=0;



        for(int i=0;i<a.length;i++)
        {
            boolean[] visited=new boolean[a.length];

                int index = i;

                while (true) {
                    if(visited[index]) {
                        count++;
                        break;
                    }
                    visited[index] = true;
                    index = a[index];

                    if (index < 0 || index >= a.length) {
                        break;
                        // break;
                    }
                }
                System.out.println("i is "+ i+ " count is "+count);



        }

        System.out.println(count);
    }
}