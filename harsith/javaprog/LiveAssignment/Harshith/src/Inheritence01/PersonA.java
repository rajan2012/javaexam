package Inheritence01;

public class PersonA extends Person {

    private String[] learnedwords;
    private int wordcount;

    public PersonA(String firstname, String lastname) {
        super(firstname, lastname);
        this.learnedwords =  new String[100];
        this.wordcount =0;
    }

    @Override
    public void learn(String newWord) {
        if(learnedwords.length>wordcount){
            learnedwords[wordcount] = newWord;
            wordcount++;
        }

    }

    @Override
    public int getNumberOfWords() {

        return wordcount;
    }

}
