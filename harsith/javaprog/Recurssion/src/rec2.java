public class rec2 {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 1};
        System.out.println(g(array, 1)); // should output "ab"
        System.out.println(g(array, 0)); // should output "bba"
    }

    public static String g(int[] a, int i) {
        // Check for valid index
        if (a[i]<0 || a[i] >= a.length) {
           // System.out.println("if"+i);
            return "";
        }
        // If a[i] is even
        else if (a[i] % 2 == 0) {
          //  System.out.println("else if"+i+a[i]);
            return "b" + g(a, a[i]);
        }
        // If a[i] is odd
        else {
          //  System.out.println("else"+i+a[i]);
            return "a" + g(a, a[i]);
        }
    }
}
