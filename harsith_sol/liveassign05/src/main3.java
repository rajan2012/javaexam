public class main3 {
    public static void main(String[] args) {
        ProductParser parser = new ProductParser();

        // Test product strings
        String[] productStrings = {
                "12345;Smartphone;399.99",
                "12;Smartphone;399.99",
                ";Smartphone;399.99",
                "12345;;399.99",
                ";;399.99"
        };

        // Parse each string and display the resulting Product object
        for (String productString : productStrings) {
            productnew product = parser.parse(productString);
            System.out.println("ID: " + product.getid() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
        }
    }
}
