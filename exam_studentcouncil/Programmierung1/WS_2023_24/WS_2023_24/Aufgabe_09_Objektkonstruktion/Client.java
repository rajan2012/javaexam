public class Client {
    private int id;
    private String name;
    private double priceOfOrderedProducts;

    public Client(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.priceOfOrderedProducts = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPriceOfOrderedProducts() {
        return priceOfOrderedProducts;
    }


    @Override
    public String toString() {
        return "Client Info \nID: " + this.id + "\nName: " + this.name + "\nValue of purchased products: " + this.priceOfOrderedProducts;
    }
}
