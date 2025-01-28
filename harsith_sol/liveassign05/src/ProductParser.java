import java.util.ArrayList;
import java.util.List;

public class ProductParser {

    int id;
    String name;
    double price;



    public ProductParser(){};


    productnew parse(String productString)
    {
        String[] s=productString.split(";");
        if(s[0].length()<5)
        {
            id=-1;
        }
        else
        {
            id=Integer.valueOf(s[0]);
        }

         if(s[1].length()==0)
        {
            name="unknown";
        }
         else
         {
             name=s[1];
         }

        price=Double.valueOf(s[2]);

        return new productnew(id,name,price);
    }

}
