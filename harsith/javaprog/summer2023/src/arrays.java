public class arrays {

    public static int[] findIntersection(int[] a, int[] b){

        int count=0;
        int[] temp = new int[Math.min(a.length,b.length)];

        for(int i=0; i<a.length;i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {

                    temp[count] = a[i];  //or temp[count++] = a[i];
                    count++;
                }

            }
        }
            int[] res = new int[count];
                    for(int i=0; i<count;i++){
                        res[i] = temp[i];
                    }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 7};
        int[] b = {2, 3, 5, 6};

        int[] intersection = findIntersection(a, b);
        System.out.print("Intersection of the two arrays is: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}
