public class ArrayReverser {
    public static void main(String[] args) {
        // Example usage
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = reverseArray(array);

        // Print the reversed array
        if (reversedArray != null) {
            for (int i = 0; i < reversedArray.length; i++) {
                System.out.print(reversedArray[i] + " ");
            }
        } else {
            System.out.println("null");
        }
    }

    public static int[] reverseArray(int[] array) {
        if (array == null) {
            return null;
        }


        int[] reversedArray = new int[array.length];


        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length-i-1];
        }

        return reversedArray;
    }
}
