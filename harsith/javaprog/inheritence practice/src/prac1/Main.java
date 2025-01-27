package prac1;

public class Main {
    public static void main(String[] args) {
        PersonA personA = new PersonA("John", "Doe");
        personA.learn("Hello");
        personA.learn("World");
        System.out.println(personA + " has learned " + personA.getNumberOfWords() + " words.");

        PersonB personB = new PersonB("Jane", "Doe");
        personB.learn("Hola");
        personB.learn("Mundo");
        System.out.println(personB + " has learned " + personB.getNumberOfWords() + " words.");
    }
}
