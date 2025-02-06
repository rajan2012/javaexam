public class Person {

    String name;

    Pet pet;

    public Person(String name)
    {
        this.name=name;
        this.pet=null;
    }

    public Person(String name,Pet pet)
    {
        this.name=name;
        this.pet=pet;
    }


    void setName(String name)
    {
        this.name=name;
    }

    String getName(String name)
    {
        return name;
    }

    void setPet(Pet pet)
    {
        this.pet=pet;
    }
}
