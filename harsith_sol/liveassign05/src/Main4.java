public class Main4 {
    public static void main(String[] args) {
        // Create an ArrayDictionary with a size of 3
        ArrayDictionary dictionary = new ArrayDictionary(3);

        // Add some elements
        dictionary.add("apple", 1);
        dictionary.add("banana", 2);
        dictionary.add("cherry", 3);

        // Try adding another element (this should succeed as there is space)
        boolean added = dictionary.add("date", 4);
        System.out.println("Added date: " + added);

        // Try adding more elements to see the behavior when the dictionary is full
        boolean addedAgain = dictionary.add("elderberry", 5);
        System.out.println("Added elderberry: " + addedAgain);

        // Retrieve values using keys
        System.out.println("apple: " + dictionary.get("apple"));
        System.out.println("banana: " + dictionary.get("banana"));
        System.out.println("cherry: " + dictionary.get("cherry"));
        System.out.println("date: " + dictionary.get("date"));
        System.out.println("elderberry: " + dictionary.get("elderberry"));
    }
}
