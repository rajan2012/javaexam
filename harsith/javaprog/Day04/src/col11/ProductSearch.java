package col11;

public class ProductSearch {

    Product findCheapestProduct(Product[] products){

        Product cheapest = products[0];

        for (Product product1 : products) {

            if(product1.getPrice()< cheapest.getPrice()){
                cheapest = product1;
            }
        }
            return cheapest;
    }

}
