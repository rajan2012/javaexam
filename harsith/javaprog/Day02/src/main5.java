public class main5 {


    public static boolean hasAtLeastThreeSameEntries(int[] a){


        for(int i=0; i< a.length;i++){

            int count =1;

            for(int j=0; j<i;j++){

                if(a[i] == a[j]){

                    count++;
                }
            }

            if(count>=3){
                return true;
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
