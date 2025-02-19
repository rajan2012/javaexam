import java.util.ArrayList;
import java.util.List;

public class evaluation {

    List<product> products;

    public evaluation(List<product> products)
    {
       this.products=products;
    }


    double cateogryValue(String category)
    {
        double total=0.0;
        for(product p:products)
        {
            if(p.category.equals(category))
            {
                total+=p.price;

            }
        }
        return total;
    }
}
