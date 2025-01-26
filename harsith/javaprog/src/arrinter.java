public class arrinter {

    public static int[] findInter(int[] a, int[] b) {

        int[] res = new int[Math.min(a.length, b.length)];
        int m = 0;
        boolean isdupli = false;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {

                    for (int k = 0; k < m; k++) {

                        if (res[k] == a[i]) {
                            isdupli = true;
                            break;
                        }

                    }
                        if(!isdupli){

                            res[m] = a[i];
                            m++;

                        }


                }

            }

        }

        return res;

    }


    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 7};
        int[] b = {2, 3, 5, 6};

        int[] intersection = findInter( a,  b);
        System.out.print("Intersection of the two arrays is: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }

    }
}