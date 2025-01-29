public class Main4 {

    public static void main(String[] args) {
        Product[] products = {
                new Product("Laptop", "Dell", 999.99),
                new Product("Smartphone", "Samsung", 799.99),
                new Product("Smartphone", "Apple", 999.99), // Duplicate name
                new Product("Tablet", 499.99)
        };

        Product foundProduct = Product.search("Smartphone", products);
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct.getBrandName() + ", " +
                    foundProduct.getBrandName() + ", $" + foundProduct.getPrice());
        } else {
            System.out.println("Product not found.");
        }
    }
}
