public class ArrayDictionary implements Dictionary {

    private DictionaryElement[] dictionary;
    private int size; // Keeps track of the number of elements in the array

    // Constructor initializes the dictionary array with the given size
    public ArrayDictionary(int capacity) {
        dictionary = new DictionaryElement[capacity];
        size = 0;
    }

    @Override
    public void add(String key, String value) {
        // Check if the key already exists
        for (int i = 0; i < size; i++) {
            if (dictionary[i] != null && dictionary[i].getKey().equals(key)) {
                return; // Key already exists, do nothing
            }
        }

        // If dictionary is full, do nothing
        if (size >= dictionary.length) {
            return;
        }

        // Add new element at the next available position
        dictionary[size] = new DictionaryElement(key, value);
        size++;
    }


    @Override
    public String get(String key) {
        // Search for the key in the dictionary
        for (int i = 0; i < size; i++) {
            if (dictionary[i] != null && dictionary[i].getKey().equals(key)) {
                return dictionary[i].getValue(); // Return the associated value
            }
        }
        return null; // Key not found
    }
}
