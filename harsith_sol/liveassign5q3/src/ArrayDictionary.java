public class ArrayDictionary {
    // Array to store the dictionary elements
    private DictionaryElement[] dictionary;

    // Constructor to initialize the array with a specified size
    public ArrayDictionary(int size) {
        dictionary = new DictionaryElement[size];
    }

    // Method to add a new key-value pair to the dictionary
    public boolean add(Object key, Object value) {
        // Search for an existing entry with the same key
        for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i] != null) {
                if (dictionary[i].getKey().equals(key)) {
                    // If the key exists, overwrite the value and return true
                    dictionary[i].setValue(value);
                    return true;
                }
            } else if (dictionary[i] == null) {
                // If the current slot is empty, add the new entry
                dictionary[i] = new DictionaryElement(key, value);
                return true;
            }
        }
        // If no space is available in the array, return false
        return false;
    }

    // Method to get the value associated with a specific key
    public Object get(Object key) {
        // Search for the DictionaryElement with the given key
        for (DictionaryElement element : dictionary) {
            if (element != null && element.getKey().equals(key)) {
                return element.getValue();
            }
        }
        // If the key is not found, return null
        return null;
    }
}