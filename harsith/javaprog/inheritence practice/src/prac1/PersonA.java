package prac1;
class PersonA extends Person {
    private String[] learnedWords;
    private int wordCount;

    // Constructor


    public PersonA(String firstName, String lastName) {
        super(firstName, lastName);
        this.learnedWords = learnedWords;
        this.wordCount = 0;
    }



    // Implementing the learn method
    public void learn(String newWord) {
        if (wordCount < learnedWords.length) {
            learnedWords[wordCount] = newWord;
            wordCount++;
        } else {
            System.out.println("Maximum words learned");
        }
    }

    // Implementing the getNumberOfWords method

    @Override
    public int getNumberOfWords() {
        return wordCount;
    }
}
