public class Main2 {
    public static void main(String[] args) {
        // Create an array of restaurants
        Restaurant r1 = new Restaurant("The Gourmet Spot", 4.5);
        Restaurant r2 = new Restaurant("Tasty Treats", 5.0);
        Restaurant r3 = new Restaurant("Quick Bites", 6.8);

        Restaurant[] restaurants = {r1, r2, r3};

        // Use RestaurantFinder to find the best restaurant
        RestaurantFinder finder = new RestaurantFinder();
        Restaurant bestRestaurant = finder.findBest(restaurants);

        // Print the name and rating of the best restaurant
        if (bestRestaurant != null) {
            System.out.println("Best Restaurant: " + bestRestaurant.getname());
            System.out.println("Rating: " + bestRestaurant.getrating());
        } else {
            System.out.println("No restaurants available.");
        }
    }
}
