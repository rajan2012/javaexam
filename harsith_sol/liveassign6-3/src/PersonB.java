import java.util.ArrayList;
import java.util.List;

public class PersonB extends Person{


    List<String> l;


    public PersonB(String first,String last)
    {
        super(first,last);
        l=new ArrayList<>();

    }

    @Override
    void learn(String newWord)
    {
        l.add(newWord);
    }


    @Override
    int getNumberOfWords()
    {
         return l.size();
    }
}
