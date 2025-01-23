public class PersonA extends Person{


    String[] s;
    //not static since each object will learn new words
    //count for each object means each person
     int count;
    public PersonA(String first,String last)
    {
        super(first,last);
        s=new String[100];
        count=0;

    }



@Override
     void learn(String newWord)
    {
       for(int i=0;i<100;i++)
       {
           if(s[i]==null)
           {
               s[i]=newWord;
               count++;
               break;
           }
       }
    }

//@Override
   public void learn2(String newWord) {
        if (count < 100) {  // Ensure the array is not full
            s[count] = newWord;
            count++;
        } else {
            System.out.println("Array is full, cannot learn more words.");
        }
    }
    @Override
   int getNumberOfWords()
    {
        return count;
    }
}
