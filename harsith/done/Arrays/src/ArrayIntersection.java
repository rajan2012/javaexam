public class ArrayIntersection {

    public static int[] findIntersection(int[] a, int[] b) {
        int[] temp = new int[Math.min(a.length, b.length)]; // Temporary array for intersection
        int count = 0; // To track the next insertion index in temp


            for(int i=0;i<a.length;i++){

                for(int j=0;j<b.length;j++){

                    if(a[i] == b[j]){

                        temp[count++] = a[i];
                    }
                }
            }

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
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
