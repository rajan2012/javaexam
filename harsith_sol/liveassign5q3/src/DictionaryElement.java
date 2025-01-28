public class DictionaryElement {
    // Private instance variables to store key and value
    private Object key;
    private Object value;

    // Constructor to initialize the key and value
    public DictionaryElement(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    // Getter method for the key
    public Object getKey() {
        return key;
    }

    // Getter method for the value
    public Object getValue() {
        return value;
    }

    // Setter method for value (in case the value needs to be updated)
    public void setValue(Object value) {
        this.value = value;
    }
}