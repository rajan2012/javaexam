public class Restaurant {

    String name;
    double rating;
    public Restaurant(String name,double rating)
    {
        this.name=name;
        this.rating=rating;
    }

    void setRating(int rating)
    {
        if(this.rating<0){
            this.rating=0;}
        else if(this.rating>5){
            this.rating=5;}
        else {
            this.rating=rating;}

    }
    void setname(String name)
    {
        this.name=name;
    }

    double getrating()
    {
        return this.rating;
    }

    String getname()
    {
        return this.name;
    }

    public Restaurant findBest(Restaurant[] restaurant)
    {
        Restaurant b=new Restaurant(restaurant[0].name,restaurant[0].rating);
        double rating=Double.MIN_VALUE;
        for(Restaurant r:restaurant)
        {
            if(r.rating>rating)
            {
                rating=r.rating;
                b=r;

            }
        }
        return b;
    }




}
