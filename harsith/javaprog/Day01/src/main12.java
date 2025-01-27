public class main12 {

    public static int[][] createArray(int[] a){

        int[][] res = new int [a.length][];

        for(int i=0;i<a.length;i++){
            res[i] =  new int[a[i]];
        }
return res;
    }


    public static void main(String[] args) {
        int[] a = {3, 1, 2, 1};
        int[][] result = createArray(a);

        // Output the sizes of each array within the two-dimensional array
        for (int i = 0; i < result.length; i++) {
            System.out.println("Size of array at index " + i + ": " + result[i].length);
        }
    }
}
