import java.util.List;

public class RestaurantFinder {

    List<Restaurant> restaurant;

    public RestaurantFinder(List<Restaurant> restaurant)
    {
        this.restaurant=restaurant;
    }

    public RestaurantFinder(){};

    public Restaurant findBest(Restaurant[] restaurant)
    {
        //Restaurant b=new Restaurant(restaurant[0].name,restaurant[0].rating);
        Restaurant b=restaurant[0];
        double rating=Double.MIN_VALUE;
        for(Restaurant r:restaurant)
        {
            if(r.getrating()>b.getrating())
           // if(r.rating>rating)
            {
                rating=r.rating;
                b=r;

            }
        }
        return b;
    }
}
