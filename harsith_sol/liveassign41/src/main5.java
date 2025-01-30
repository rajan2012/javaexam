
public class main5 {
    public static void main(String[] args) {

        ArrayDictionary dict = new ArrayDictionary(5);

        dict.add("apple", "fruit");
        dict.add("car", "vehicle");
        dict.add("apple", "not allowed"); // Duplicate key, should be ignored

        System.out.println(dict.get("apple")); // Output: fruit
        System.out.println(dict.get("car"));   // Output: vehicle
        System.out.println(dict.get("bike"));  // Output: null (not found)
    }
}
