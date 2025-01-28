public class Main {
    public static void main(String[] args) {
        myData dataInstance = new myData();

        // Initialize with an array of integers
        int[] myArray = {10, 20, 30, 40, 50};
        dataInstance.init(myArray);

        // Access values using the at method
        System.out.println("Value at index 2: " + dataInstance.at(2));  // Output: 30
        System.out.println("Value at index 4: " + dataInstance.at(4));  // Output: 50

        // Attempt to access an invalid index (uncomment to test exception)
        // System.out.println(dataInstance.at(10));  // This will throw an exception
    }
}
