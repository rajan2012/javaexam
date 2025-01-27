package inheritence;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Create an instance of PersonA
        PersonA personA = new PersonA("John", "Doe");
        personA.learn("Hello");
        personA.learn("World");

        // Create an instance of PersonB
        PersonB personB = new PersonB("Jane", "Doe");
        personB.learn("Hello");
        personB.learn("Java");
        personB.learn("Programming");

        // Display the number of words learned by PersonA
        System.out.println(personA + " has learned " + personA.getNumberOfWords() + " words.");

        // Display the number of words learned by PersonB
        System.out.println(personB + " has learned " + personB.getNumberOfWords() + " words.");
    }
}

