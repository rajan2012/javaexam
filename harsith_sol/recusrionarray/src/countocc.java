import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class countocc {

    public static int countOccurrences(int[] arr, int index, int target) {
        // Base case: if index is out of bounds, return 0
        if (index == arr.length) {
            return 0;
        }

        // If the current element matches the target, count 1, else count 0
        int count = (arr[index] == target) ? 1 : 0;

        // Recursive call: count occurrences in the rest of the array
        return count + countOccurrences(arr, index + 1, target);
    }

    public static Map<Integer,Integer> sumarray(int[] a,int index,Map<Integer,Integer> m)
    {
        if(index==a.length)
            return m;
        //change the below one as per problems
        m.put(a[index], m.getOrDefault(a[index],0)+1);
        return sumarray(a,index+1,m);
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[] a={1,4,3,6,6,1,4,1,3,1};

        Map<Integer,Integer> m=new HashMap<>();

        Map<Integer,Integer> sum=sumarray(a,0,m);

        for(Integer b:m.keySet()) {
            System.out.println("key "+b +" its count "+m.get(b));
        }


    }
}
