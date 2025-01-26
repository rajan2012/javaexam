package co02;

public class DictionaryElement {

  private Object key;
  private Object value;


    public DictionaryElement(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
