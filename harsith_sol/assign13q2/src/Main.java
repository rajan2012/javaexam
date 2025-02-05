import java.util.*;

public class Main {



    public static Map<String,Integer> countNationalities(List<Person> personList) {
        Map<String, Integer> m=new HashMap<>();
        for(Person p:personList) {
            m.put(p.nationality,m.getOrDefault(p.nationality,0)+1);
        }

        return m;
    }

    public static int getNumberOfPeople(Map<String,Integer> nationalityMap, String nationality) {


return nationalityMap.getOrDefault(nationality,0);
    }

    public static List<Person> getPeople(List<Person> list, String nationality) {
        List<Person> l=new ArrayList<>();

        for(Person p:list)
        {
            if(p.nationality.equals(nationality))
            {
                l.add(p);
            }
        }

        return l;
    }

    /* Your Code End */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> personList = new LinkedList<>();

        System.out.print("Number of persons: ");
        int size = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < size; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Nationality: ");
            String nationality = sc.nextLine();

            Person p = new Person(name,nationality);
            personList.add(p);
        }

        Map<String,Integer> map = countNationalities(personList);

        for(String k:map.keySet()) {

                System.out.println("for key "+k+" has value "+map.get(k));

            }

        System.out.println("Number of nationalities: " + map.size());

        System.out.print("Nationality: ");
        String nationality = sc.nextLine();
        int numberOfPeople = getNumberOfPeople(map,nationality);

        System.out.println("The list contains " + numberOfPeople + " people with " + nationality + " nationality.");

        System.out.println("List of People:");
        List<Person> list = getPeople(personList,nationality);
        for(Person p : list){
            System.out.println(p.name);
        }

    }
}
