package co01;

public class Main {
    public static void main(String[] args) {
        Restaurant[] restaurants = new Restaurant[]{
                new Restaurant("Restaurant A", 4.5),
                new Restaurant("Restaurant B", 4.7),
                new Restaurant("Restaurant C", 3.9),
                new Restaurant("Restaurant D", 4.8),
                new Restaurant("Restaurant E", 2.3)
        };

        RestaurantFinder finder = new RestaurantFinder();
        Restaurant bestRestaurant = finder.findBest(restaurants);
        if (bestRestaurant != null) {
            System.out.println("The best restaurant is " + bestRestaurant.getName() +
                    " with a rating of " + bestRestaurant.getRating());
        } else {
            System.out.println("No restaurants found.");
        }
    }
}

