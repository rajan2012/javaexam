public class product {

    String name;
    String category;
    double price;

    public product(String name,String category,double price)
    {
        this.name=name;
        this.category=category;
        this.price=price;



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
