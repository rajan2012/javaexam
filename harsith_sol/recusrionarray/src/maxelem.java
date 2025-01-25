

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class maxelem {

    public static int findMax(int[] arr, int index) {
        // Base case: if the index is out of bounds, return the minimum possible value
        if (index == arr.length - 1) {
            return arr[index];
        }

        // Recursive call: find the max in the rest of the array
        int maxInRest = findMax(arr, index + 1);

        // Return the maximum between the current element and the maximum in the rest of the array
        return Math.max(arr[index], maxInRest);
    }

    public static int sumarray(int[] a,int index,int max)
    {
        if(index==a.length) {
            return max;
        }

        if(max<a[index])
        {
            max=a[index];

        }
        return sumarray(a,index+1,max);


    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] a={1,14,3,6};

        int sum=sumarray(a,0,Integer.MIN_VALUE);

        System.out.println(sum);


    }
}
