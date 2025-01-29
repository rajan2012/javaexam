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

    void setPrice(String price)
    {
        this.price=price;
    }
}
