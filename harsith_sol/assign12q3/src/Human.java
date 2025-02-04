public class Human {

    String name;
    int id;
    static int idcounter=1;

    Woman mother;
    Man father;

    public Human(String name)
    {
        this.name=name;
        this.id=idcounter++;
        this.father=null;
        this.mother=null;
    }

    public Human(String name,Man father,Woman mother)
    {
        this.name=name;
        this.id=idcounter++;
        this.father=father;
        this.mother=mother;
    }

}
