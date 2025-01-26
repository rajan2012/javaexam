
package prac1;
abstract class Person {
    private String firstName;
    private String lastName;

    // Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Abstract method for learning a new word
    public abstract void learn(String newWord);

    // Abstract method to get the number of words learned
    public abstract int getNumberOfWords();

    // toString method to return the first and last name

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}