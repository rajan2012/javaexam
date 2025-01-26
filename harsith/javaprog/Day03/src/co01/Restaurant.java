package co01;

public class Restaurant {

    private String name;
    private double rating;

    public Restaurant(String name, double rating) {
        this.name = name;

        if(rating>0){
            this.rating = rating;
        }
        else if(rating<5){
            this.rating = rating;
        }
        else this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }
}
