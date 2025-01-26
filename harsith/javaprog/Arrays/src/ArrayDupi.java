//Arrays
//An array of a method was passed;
//You should check whether any number in the array appears exactly twice,
//if so, issue these,
//if not false;
//when single array given count is between two for loops (should reset after one check so)
//when two arrays given count outside as whole count needed then count outside(common concepts)


public class ArrayDupi {

    private static void findAndPrintDuplicates(int[] a) {
        boolean isdupi = false;

        for (int i = 0; i < a.length; i++) {
            // Skip if this number was already checked
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] ) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Number found that appears exactly twice: " + a[i]);
                isdupi = true;
            }
        }

        if (!isdupi) {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 2, 5, 3}; // Example array
        findAndPrintDuplicates(a);
    }
}
