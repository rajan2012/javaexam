public class Main {

    private static void findAndPrintUnique(int[] a) {
        boolean foundUnique = false;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            // If a number appears exactly once, print it and mark that we found at least one unique number
            if (count == 1) {
                System.out.println("Number found that appears exactly once: " + a[i]);
                foundUnique = true;
            }
        }

        // If no unique number is found, print "false"
        if (!foundUnique) {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 2, 5, 3, 6}; // Example array
        findAndPrintUnique(a);
    }
}
