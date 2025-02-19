public class main5 {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "deabc";

        int rotationPoint = findRotationPoint(s1, s2);
        if (rotationPoint != -1) {
            System.out.println("The point of rotation is: " + rotationPoint);
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }

    public static int findRotationPoint(String s1, String s2) {
        // Check if the lengths of the strings are equal
        if (s1.length() != s2.length()) {
            return -1;  // Strings can't be rotations of each other if their lengths are not equal
        }

        // Concatenate s1 with itself to cover all possible rotations
        String doubledS1 = s1 + s1;

        // Find the index of s2 in the concatenated string
        int index = doubledS1.indexOf(s2);
        return index;  // Return the index, which is the point of rotation
    }
}
