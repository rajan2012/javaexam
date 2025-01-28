import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create product objects
        product p1 = new product("Laptop", "Electronics", 1200.50);
        product p2 = new product("Smartphone", "Electronics", 800.75);
        product p3 = new product("Shirt", "Clothing", 40.25);
        product p4 = new product("Jeans", "Clothing", 60.00);

        // List of products
        List<product> products = List.of(p1, p2, p3, p4);

        // Create evaluation object with the list of products
        evaluation evaluation = new evaluation(products);

        // Calculate total value for the "Electronics" category
        double electronicsValue = evaluation.cateogryValue("Electronics");
        System.out.println("Total value of Electronics: " + electronicsValue);

        // Calculate total value for the "Clothing" category
        double clothingValue = evaluation.cateogryValue("Clothing");
        System.out.println("Total value of Clothing: " + clothingValue);
    }
}
