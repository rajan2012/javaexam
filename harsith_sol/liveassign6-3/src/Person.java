public abstract class Person {
    String first;
    String last;

    public Person(String first,String last)
    {
        this.first=first;
        this.last=last;

    }

   abstract void learn(String newWord);

    abstract int getNumberOfWords();


    public String toString()
    {
        return first+" "+last;
    }
}
