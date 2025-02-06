import java.util.ArrayList;
import java.util.List;

public class main4 {

    private List<String> list = new ArrayList<>();



    public static void main(String[] args) {
        List<String> example = new ArrayList<>();

        // Adding some initial values to the list
        example.add("apple");
        example.add("banana");
        example.add("cherry");

        int index = example.indexOf("banana");
        System.out.println("index is "+index);

            example.add(index + 1, "star"); // Insert t after s

        System.out.println("lsit is "+example.toString());

        example.add( "star");

        System.out.println("lsit is "+example.toString());

    }
}
