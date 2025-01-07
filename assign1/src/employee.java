public class employee {

String name;
int age;
String role;

private employee e;

public employee(){};
public employee(String name, String role, int age)
{
   // e=new employee(name,role,age);
    if(age<18)
    {
        throw new IllegalArgumentException("age must be more than 18");
    }
    this.name=name;
    this.age=age;
    this.role=role;
}

    public void setname(String name)
    {
        this.name=name;
    }

    public void setrole(String role)
    {
        this.role=role;
    }


public void setage(int age)
{
    this.age=age;
}


    public String getname()
    {
        return name;
    }

    public String getrole()
    {
        return role;
    }


    public int getage()
    {
        return age;
    }



@Override
public String toString()
{
   return " name "+name+" age "+ age+ " role "+role;
}

}
