import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {

    String name;
    String nationality;


    public Person(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    Map<String, Integer> countNationalities2(List<Person> peopleList)
    {
        Map<String, Integer> m=new HashMap<>();
        for(Person p:peopleList) {
            m.put(p.nationality,m.getOrDefault(p,0)+1);
        }

        return m;
    }

    int getNumberOfPeople2(Map<String, Integer> map,String nationality)
    {
         return map.get(nationality);
    }

    List<Person> getPeople2(List<Person> personList,String nationality)
    {
        List<Person> l=new ArrayList<>();

        for(Person p:personList)
        {
            if(p.nationality.equals(nationality))
            {
                l.add(p);
            }
        }

        return l;

    }

}
