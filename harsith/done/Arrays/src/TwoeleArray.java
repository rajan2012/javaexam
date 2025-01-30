//arrays
//you should write a method that takes two arrays as parameters and checks if at least
//two numbers from the first array also appear in the second array
//if yes, “true” should be returned, if no, “false”
//e.g. A = {1,2,3}; B = {4,5,6,7} → false
//A = {1,2,3}; B = {1,2,6} → true
//A = {}; B = {1,2,3,4,5,6} → false



public class TwoeleArray {

    public static boolean checkCommonElements(int[] a, int[] b){

        int count =0;

        for(int i=0; i<a.length;i++){

            for(int j=0; j<b.length;j++){

                if(a[i] == b[j]){

                    count++;


                }

            }
            if(count>=2){
                return true;
            }
        }

              return false;

    }





    public static void main(String[] args) {
        int[] A1 = {1, 2, 3};
        int[] B1 = {4, 5, 6, 7};
        int[] A2 = {1, 2, 3,6};
        int[] B2 = {1, 2, 6};
        int[] A3 = {1};
        int[] B3 = {1, 2, 3, 4, 5, 6};

        System.out.println(checkCommonElements(A1, B1)); // false
        System.out.println(checkCommonElements(A2, B2)); // true
        System.out.println(checkCommonElements(A3, B3)); // false
    }
}
