public class arrayscalar {

    public static int calculateScalarProduct(int[] a, int[] b){

        int prod = 0;

        if (a.length != b.length) {
            throw new IllegalArgumentException("Vectors must be of the same length.");
        }

        for (int i=0; i<a.length;i++){
            prod = prod + a[i] * b[i];
        }

        return prod;
    }



    public static void main(String[] args) {
        int[] vectorA = {2, 3, 4};
        int[] vectorB = {10, 20, 30};

        int result = calculateScalarProduct(vectorA, vectorB);
        System.out.println("The scalar product is: " + result);
    }
}