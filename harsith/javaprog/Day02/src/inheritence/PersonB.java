package inheritence;

import java.util.ArrayList;

public class PersonB extends Person{

    ArrayList<String> learnedwords;

    public PersonB(String firstname, String lastname) {
        super(firstname, lastname);
        this.learnedwords = new ArrayList<>();
    }

    @Override
    public void learn(String newWord) {

        learnedwords.add(newWord);
    }

    @Override
    public int getNumberOfWords() {

        return learnedwords.size();
    }

}
