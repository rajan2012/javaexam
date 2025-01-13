import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TechnicalDictionary dictionary = new TechnicalDictionary(scanner);

        // Add three sample entries
        dictionary.enter("Polymorphism", "The ability of an object to take many forms.");
        dictionary.enter("Encapsulation", "The bundling of data with methods.");
        dictionary.enter("Inheritance", "The mechanism where one class acquires the properties of another.");

        // Practice 10 times
        for (int i = 0; i < 2; i++) {
            dictionary.exercise();
        }

        // Output the dictionary contents
        System.out.println("Final Dictionary:");
        System.out.println(dictionary);
    }
}