package co02;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayDictionary with a specific capacity
        ArrayDictionary dictionary = new ArrayDictionary(5);

        // Adding elements to the dictionary
        dictionary.add("key1", "value1");
        dictionary.add("key2", "value2");
        dictionary.add("key3", "value3");

        // Attempting to add a new value for an existing key
        dictionary.add("key2", "new value2");

        // Retrieve and print values
        System.out.println("Value associated with 'key1': " + dictionary.get("key1"));
        System.out.println("Value associated with 'key2': " + dictionary.get("key2")); // This should show "new value2"
        System.out.println("Value associated with 'key3': " + dictionary.get("key3"));

        // Trying to get a value for a key that doesn't exist
        System.out.println("Value associated with 'key4': " + dictionary.get("key4")); // This should print "null"
    }
}

