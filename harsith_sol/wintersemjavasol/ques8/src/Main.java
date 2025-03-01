// Abstract class BaseObject
abstract class BaseObject {
    // Method to check if the instance is a StringObject
    boolean isStringObject() {
        return this instanceof StringObject;
    }

    // Method to check if the instance is a ListObject
    boolean isListObject() {
        return this instanceof ListObject;
    }

    // Method to check if the instance is a MapObject
    boolean isMapObject() {
        return this instanceof MapObject;
    }

    // Convert to StringObject
    StringObject asStringObject() {
        if (this instanceof StringObject) {
            return (StringObject) this;
        }
        throw new ClassCastException("Casting not possible");
    }

    // Convert to ListObject
    ListObject asListObject() {
        if (this instanceof ListObject) {
            return (ListObject) this;
        }
        throw new ClassCastException("Casting not possible");
    }

    // Convert to MapObject
    MapObject asMapObject() {
        if (this instanceof MapObject) {
            return (MapObject) this;
        }
        throw new ClassCastException("Casting not possible");
    }
}


// StringObject extending BaseObject
class StringObject extends BaseObject {
    private String value;

    // Constructor
    public StringObject(String value) {
        this.value = value;
    }

    // Method to return stored string value
    public String toString() {
        return value;
    }
}



import java.util.ArrayList;
import java.util.List;

// ListObject extending BaseObject
class ListObject extends BaseObject {
    private List<BaseObject> list;

    // Constructor
    public ListObject() {
        this.list = new ArrayList<>();
    }

    // Append an object to the list
    public void add(BaseObject obj) {
        list.add(obj);
    }

    // Retrieve object at given index
    public BaseObject get(int index) {
        return list.get(index);
    }

    // Get size of the list
    public int size() {
        return list.size();
    }
}



import java.util.HashMap;
import java.util.Map;

// MapObject extending BaseObject
class MapObject extends BaseObject {
    private Map<String, BaseObject> map;

    // Constructor
    public MapObject() {
        this.map = new HashMap<>();
    }

    // Add a key-value pair to the map
    public void add(String key, BaseObject value) {
        map.put(key, value);
    }

    // Retrieve object for a given key
    public BaseObject get(String key) {
        return map.get(key);
    }
}


public class Main {
    public static void main(String[] args) {
        // Testing StringObject
        StringObject strObj = new StringObject("Hello World");
        System.out.println("StringObject: " + strObj);

        // Testing ListObject
        ListObject listObj = new ListObject();
        listObj.add(new StringObject("Item1"));
        listObj.add(new StringObject("Item2"));
        System.out.println("ListObject Size: " + listObj.size());
        System.out.println("ListObject First Element: " + listObj.get(0));

        // Testing MapObject
        MapObject mapObj = new MapObject();
        mapObj.add("Key1", new StringObject("Value1"));
        System.out.println("MapObject Get Key1: " + mapObj.get("Key1"));

        // Checking Type Cast Exceptions
        try {
            BaseObject obj = new StringObject("Test");
            obj.asListObject();  // Should throw an exception
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }
}


