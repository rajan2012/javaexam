package co02;

public class ArrayDictionary {

    private DictionaryElement[] dictionary;
    //private int size;

    public ArrayDictionary(int size) {
        this.dictionary = new DictionaryElement[size];
      //  this.size = 0;
    }

    public boolean add(Object key, Object value) {
        for (int i = 0; i < dictionary.length; i++) {
            // Check if an element at the current index is not null and if its key matches the provided key
            if (dictionary[i] != null && dictionary[i].getKey().equals(key)) {
                dictionary[i] = new DictionaryElement(key, value); // Update existing element
                return true;
            } else if (dictionary[i] == null) {
                dictionary[i] = new DictionaryElement(key, value); // Add new element
                //size++; // Increment the size since a new element is added
                return true; // Return true after successfully adding a new element
            }
        }
        return false; // Return false if the dictionary is full and no more elements can be added
    }

    public Object get(Object key) {
        for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i] != null && dictionary[i].getKey().equals(key)) {
                return dictionary[i].getValue(); // Return the value if the key matches
            }
        }
        return null; // Return null if no matching key is found
    }
}
