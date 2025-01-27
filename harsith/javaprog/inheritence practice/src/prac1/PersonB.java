package prac1;

import javax.swing.*;
import java.util.ArrayList;

class PersonB extends Person {
    private ArrayList<String> learnedWordsList;

    // Constructor
    public PersonB(String firstName, String lastName) {
        super(firstName, lastName);
        this.learnedWordsList = new ArrayList<>();
    }

    // Implementing the learn method
    public void learn(String newWord) {

        learnedWordsList.add(newWord);
    }

    // Implementing the getNumberOfWords method

    @Override
    public int getNumberOfWords() {
        return 0;
    }
}