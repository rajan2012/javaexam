

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class reversearray {

    public static int sumarray(int[] a,int index)
    {
        if(index==a.length)
            return 0;

        return a[index]+sumarray(a,index+1);
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] a={1,4,3,6};

        int sum=sumarray(a,0);

        System.out.println(sum);


    }
}
