import java.util.Scanner;

public class ArrayDictionary {


    DictionaryElement[] dictionary;

    public ArrayDictionary(int size) {
        dictionary = new DictionaryElement[size];
    }

    public boolean add2(Object key, Object value) {
        // Search for an existing entry with the same key
        for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i] != null) {
                if (dictionary[i].getkey().equals(key)) {
                    // If the key exists, overwrite the value and return true
                    dictionary[i].setvalue(value);
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

    boolean add(Object key, Object value) {
        boolean flag = false;
        for (int i = 0; i < dictionary.length; i++) {

              if(dictionary[i]!= null)
            {
                if(dictionary[i].getkey().equals(key))
                {
                    dictionary[i].setvalue(value);
                    //here can directly return true;
                    flag = true;
                   // return true;
                }
            }
           else  if (dictionary[i] == null) {
                dictionary[i] = new DictionaryElement(key, value);
               flag = true;
                 // return true;
            }

        }
       // return false;
        return flag;
    }

    Object get2(Object key) {
        //Object b = null;
        for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i].getkey() == key &&dictionary[i]!=null) {
                {
                    //dictionary is of dictionary type
                    //its param are of object type
                    return dictionary[i].getvalue();
                }
            }
        }
        return null;
    }

    public Object get(Object key) {
        // Search for the DictionaryElement with the given key
        for (DictionaryElement element : dictionary) {
            if (element != null && element.getkey().equals(key)) {
                return element.getvalue();
            }
        }
        // If the key is not found, return null
        return null;
    }
}
