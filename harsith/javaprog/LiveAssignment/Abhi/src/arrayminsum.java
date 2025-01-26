public class arrayminsum {


    public static int minSum(int[][] a){

        int minsum =0;
        int rowminindex =0;

        for(int j=0;j<a[0].length;j++){

           minsum = minsum + a[0][j];
        }

        for(int i =0; i<a.length;i++){

            int minrowsum =0;

            for(int j =0; j<a[i].length;j++){

                minrowsum = minrowsum + a[i][j];

            }
             if(minrowsum < minsum){
                 minsum = minrowsum;
                 rowminindex = i;
             }


        }

        return rowminindex;


    }

    public static void main(String[] args) {
        int[][] testArray = {

                {28, 22, 17, 19},
                {1, 2, 3, 4},
                {8, 27, 20, 43},
                {10, 10, 11, 18}
        };

        System.out.println("The index of the row with the smallest sum is: " + minSum(testArray));
    }

}
