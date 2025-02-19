import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class subsetsum {

    public static List<Integer> sumarray(int[] a,int index,int sum,List<Integer> l)
    {

        if(index==a.length) {
            return l;
        }

        int target2=sum;

        int target=sum-a[index];

       // System.out.println("target are "+target);



        if(a[index]<=sum)
        {
            l.add(a[index]);
            return sumarray(a, index + 1, target, l);
        }
        else
        {
            return sumarray(a, index + 1, target2, l);
        }
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] a = {3, 34, 4, 12, 5, 2};
        int sum = 38;

        List<Integer> l=new ArrayList<>();

        List<Integer> sum2=sumarray(a,0,sum,l);


        for(int i:sum2) {
            System.out.println(i);
        }


    }
}