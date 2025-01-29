public class Product {

    String name;
    String brandName;
    double price;

    Product(String name,String brandName, double price)
    {
      this.name=name;
      this.brandName=brandName;
      this.price=price;
    }

    Product(String name,double price)
    {this.name=name;
        this.brandName="unknown";
        this.price=price;

    }

    void setName(String name)
    {
        this.name=name;
    }

    void setBrandName(String brandName)
    {
        this.brandName=brandName;
    }

    void setPrice(double price)
    {
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public String getBrandName() {
        return brandName;
    }

    public double getPrice() {
        return price;
    }

   static Product search(String productName, Product[] products)
    {
         for(Product p:products) {
             if (p.name.equals(productName)) {
                 return p;
                 // break;
             }

         }
         return null;
    }
}
