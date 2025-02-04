public class Human {

    String name;
    int id;
    static int idcounter=1;

    public Human(String name)
    {
        this.name=name;
        this.id=idcounter++;
    }

}
