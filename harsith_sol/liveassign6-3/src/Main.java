public class Main {
    public static void main(String[] args) {
        PersonA personA = new PersonA("Alice", "Johnson");
        personA.learn("Hola");
        personA.learn("Bonjour");
        System.out.println(personA.toString() + " knows " + personA.getNumberOfWords() + " words.");

        PersonB personB = new PersonB("Bob", "Smith");
        personB.learn("Hello");
        personB.learn("Ciao");
        System.out.println(personB.toString() + " knows " + personB.getNumberOfWords() + " words.");
    }
}
