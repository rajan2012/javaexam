public class Restaurant {

    String name;
    double rating;
    public Restaurant(String name,double rating)
    {
        this.name=name;
        if(rating<0.0){
            this.rating=0.0;}
        else if(rating>5.0){
            this.rating=5.0;}
        else {
            this.rating=rating;}
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
        return rating;
    }

    String getname()
    {
        return name;
    }






}
