//A method should be written that returns true if the array consists of at least 3
//same entries, otherwise false.

//*atleast asked and one array - count=1 and count between  2 for loops.*
//in ques asked for true false - method always boolean.

public class countAtlease {

    public static boolean hasAtLeastThreeSameEntries(int[] array){

        for (int i = 0; i < array.length; i++) {
            int count = 1; // Start count at 1 for the current element
            for (int j = 0; j < i; j++) {
                if ( array[i] == array[j]) {
                    count++; // Increment count if a duplicate is found
                }

            }
            if (count >=3) {
                return true; // Return true if at least three duplicates are found
            }
        }
        return false;

    }


    public static void main(String[] args) {
        int[] testArray1 = {1, 1, 3, 4, 5};
        int[] testArray2 = {1, 1, 1, 2, 3};
        int[] testArray3 = {1, 2, 3, 3, 3};

        System.out.println(hasAtLeastThreeSameEntries(testArray1)); // false
        System.out.println(hasAtLeastThreeSameEntries(testArray2)); // true
        System.out.println(hasAtLeastThreeSameEntries(testArray3)); // true
    }
}
