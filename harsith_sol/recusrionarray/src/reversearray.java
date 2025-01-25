

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class reversearray {

    public static void reverseArray(int[] arr, int start, int end) {
        // Base case: when start index is greater than or equal to end index
        if (start >= end) {
            return;
        }

        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call to reverse the rest of the array
        reverseArray(arr, start + 1, end - 1);
    }

    public static int[] sumarray(int[] a,int[] result,int index)
    {
        if(index==a.length)
            return result;
        else
        {
            result[a.length-(index+1)]=a[index];
            return sumarray(a,result,index+1);
        }

    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] a={1,4,3,6};

        int[] res=new int[a.length];

        int[] sum=sumarray(a,res,0);

        for(int i=0;i<a.length;i++) {
            System.out.println(sum[i]);
        }


    }
}
