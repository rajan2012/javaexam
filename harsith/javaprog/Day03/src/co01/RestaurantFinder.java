package co01;

public class RestaurantFinder {


    public Restaurant findBest(Restaurant[] restaurants){

        if(restaurants == null || restaurants.length ==0){
            return null;
        }

        Restaurant best = restaurants[0];

        for(int i=0; i< restaurants.length;i++){

            if(restaurants[i].getRating() > best.getRating()){
                       best = restaurants[i];

            }
        }
        return best;
    }
}
