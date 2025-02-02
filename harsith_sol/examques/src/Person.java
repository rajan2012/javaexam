public class Person {

    String name;
    static int idcounter=1000;
    int id;

    public Person(String name)
    {
        this.name=name;
        this.id=idcounter++;
    }


}
