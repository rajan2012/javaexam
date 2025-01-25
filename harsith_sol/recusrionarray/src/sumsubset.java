
import java.util.ArrayList;
import java.util.List;

public class sumsubset {

    public static List<List<Integer>> findSubsets(int[] a, int index, int sum, List<Integer> current) {
        // Result list to store all valid subsets
        List<List<Integer>> result = new ArrayList<>();

        // Base condition: if we reach the end of the array
        if (index == a.length) {
            if (sum == 0) {
                result.add(new ArrayList<>(current));  // If sum is zero, add the current subset to result
            }
            return result;
        }

        // Include the current element in the subset and reduce the sum
        if (a[index] <= sum) {
            current.add(a[index]);
            result.addAll(findSubsets(a, index + 1, sum - a[index], current));
            current.remove(current.size() - 1);  // Backtrack
        }

        // Exclude the current element and move to the next
        result.addAll(findSubsets(a, index + 1, sum, current));

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        int sum = 10;

        List<List<Integer>> subsets = findSubsets(arr, 0, sum, new ArrayList<>());

        // Print all subsets
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
