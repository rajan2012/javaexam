package inheritence;

public class PersonA extends Person{

  private String[] learnedwords;
 // private int wordcount;

  public PersonA(String firstname, String lastname) {
    super(firstname, lastname);
    this.learnedwords =  new String[100];
   // this.wordcount =0;
  }

  @Override
  public void learn(String newWord) {

    for(int i=0;i< learnedwords.length;i++){

      if(learnedwords[i] == null){
         learnedwords[i] = newWord;
         break;
      }

    }

  }

  @Override
  public int getNumberOfWords() {
    int count =0;
    for(int i=0;i< learnedwords.length;i++){

      if(learnedwords[i] != null){
        count++;
      }

    }
   return count;
  }

}
