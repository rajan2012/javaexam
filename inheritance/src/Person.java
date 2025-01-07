public class Person {

    String name;
    int age;

    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String display()
    {
        return "in person "+name+"age "+age;
    }
}
