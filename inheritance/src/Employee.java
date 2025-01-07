public class Employee extends Person {

    String city;

    public Employee(String name, int age,String city)
    {
        super(name,age);
        this.city=city;
    }

    @Override
    public String toString()
    {
        return "name "+name+" age "+age+ " city "+city;
    }
}
