import java.util.Arrays;

public class ArrayComparison {
    public int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException("Only nonnegative integers");
            }
            sum += number;
        }
        return sum;
    }


}
