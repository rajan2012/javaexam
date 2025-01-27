import java.util.ArrayList;
import java.util.List;

public class productnew {

    int id;
    String name;
    double price;

    List<productnew> l;

    public productnew(int id,String name,double price)
    {
        //productnew[i]=new productnew[];
         l=new ArrayList<>();
        this.id=id;
        this.name=name;
        this.price=price;
    }

    productnew parse(String productString)
    {
        String[] s=productString.split(";");
        if(s[0].length()<5)
        {
            id=-1;
        }

         if(s[1].length()==0)
        {
            name="unknown";
        }


            id=Integer.valueOf(s[0]);
            name=s[1];

        price=Double.valueOf(s[2]);

        return new productnew(id,name,price);
    }

}
