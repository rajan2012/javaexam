import java.util.ArrayList;
import java.util.List;


public class productnew {

    int id;
    String name;
    double price;

   // List<ProductParser> l;

    public productnew(int id, String name, double price) {
        //productnew[i]=new productnew[];
       // l = new ArrayList<>();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int getid()
    {
        return id;
    }

    String getName()
    {
        return name;
    }

    double getPrice()
    {
        return price;
    }
}


