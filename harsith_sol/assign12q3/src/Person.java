public class Person {

    int id;
    String name;
    int age;
    String address;
    static int idcounter=1;


    Person(String name, int age, String address) throws AgeTooLowException,IllegalAddressException
    {
        if(name==null)
        {
            throw new NullPointerException("Names are not\n" +
                    "allowed to be null");
        }
        if(age<0)
        {
            throw new AgeTooLowException("Age must be greater or equal to zero:",age);
        }

        //won't work because if it has no 2 parts means, no comma
        //so check for commas
       // String[] parts=address.split(",");
         if (!address.contains(",")) {
       // if(parts.length<2)

            throw new IllegalAddressException("Address is not correctly formatted",address);
        }

        this.name=name;
        this.age=age;
        this.address=address;
        this.id=idcounter++;
    }

    @Override
   public String toString()
    {
        return this.id+" "+this.name+" "+this.age+" "+this.address;
    }

}
