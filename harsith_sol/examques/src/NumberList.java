import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NumberList {

    List<Integer> l;

    public NumberList()
    {
       // l=new ArrayList<>();
        l=new LinkedList<>();
    }

    void addNumber(int number)
    {
        l.add(number);
    }

    public List<Integer> getNumbers() {
        return l;
    }

}
