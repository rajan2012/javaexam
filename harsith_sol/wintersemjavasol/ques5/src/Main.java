public class TaskDataConversion {
    public static int virtualArrayGet(int[] base, int[] dim, int[] pos) {
        if (dim.length != pos.length) {
            throw new IllegalArgumentException("Dimension mismatch");
        }

        int index = 0;
        int multiplier = 1;

        for (int i = dim.length - 1; i >= 0; i--) {
            if (pos[i] < 0 || pos[i] >= dim[i]) {
                throw new ArrayIndexOutOfBoundsException("Invalid position");
            }
            index += pos[i] * multiplier;
            multiplier *= dim[i];
        }

        if (index >= base.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }

        return base[index];
    }

    public static void main(String[] args) {
        int[] base = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
        int[] dim = {4, 3, 2};  // 3D array dimensions
        int[] pos = {1, 2, 1};  // Accessing element at (1,2,1)

        System.out.println(virtualArrayGet(base, dim, pos)); // Output: 19
    }
}
