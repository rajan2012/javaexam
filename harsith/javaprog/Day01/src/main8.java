public class main8 {

    public static double[][] mulMatrices(double[][] matrix1, double[][] matrix2){

        if(!isValid(matrix1,matrix2)){
            return null;
        }

        double [][] result = new double[matrix1.length][matrix2[0].length];

        for(int i=0; i<matrix1.length;i++){

            for(int j=0;j<matrix2[0].length;j++){

                for(int k=0; k<matrix1[0].length;k++){

                      result[i][j] = matrix1[i][k] * matrix2[k][j];

                }
            }
        }
return result;
    }



    public static boolean isValid(double[][] matrix1, double[][] matrix2) {
        // Check if the number of columns in matrix1 equals the number of rows in matrix2
        return matrix1[0].length == matrix2.length;
    }

    public static void main(String[] args) {
        // Example matrices for multiplication
        double[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        double[][] matrix2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        // Check if multiplication is valid and perform it if so
        if (isValid(matrix1, matrix2)) {
            double[][] result = mulMatrices(matrix1, matrix2);
            System.out.println("Result of matrix multiplication:");
            for (double[] row : result) {
                for (double value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("The matrices cannot be multiplied.");
        }
    }
}
