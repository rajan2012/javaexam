import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Product {
    private String artno;
    private String name;
    private int price;



    // Constructor to parse and initialize a Product from a line
    public Product(String line) {
        String[] parts = line.split(",\\s*");
        for (String part : parts) {
            if (part.startsWith("name:")) {
                name = part.split(":")[1].trim().replace("\"", "");
            } else if (part.startsWith("artno:")) {
                artno = part.split(":")[1].trim().replace("\"", "");
            } else if (part.startsWith("price:")) {
                price = Integer.parseInt(part.split(":")[1].trim());
            }
        }
    }

    // Getters
    public String getArtno() {
        return artno;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "artno: \"" + artno + "\", name: \"" + name + "\", price: " + price;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Path inputPath = Paths.get("Productlist.txt");
        Path modOutputPath = Paths.get("ModProductlist.txt");
        Path cheapOutputPath = Paths.get("CheapProducts.txt");

        // Read data from file using Paths
        try {
            List<String> lines = Files.readAllLines(inputPath);
            for (String line : lines) {
                products.add(new Product(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write data to ModProductlist.txt in a fixed format
        List<String> modOutputLines = new ArrayList<>();
        for (Product product : products) {
            modOutputLines.add(product.toString());
        }
        try {
            Files.write(modOutputPath, modOutputLines);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write CheapProducts.txt and calculate statistics
        List<String> cheapOutputLines = new ArrayList<>();
        int total = 0, count = 0, minPrice = Integer.MAX_VALUE, maxPrice = Integer.MIN_VALUE;
        for (Product product : products) {
            total += product.getPrice();
            count++;
            minPrice = Math.min(minPrice, product.getPrice());
            maxPrice = Math.max(maxPrice, product.getPrice());

            if (product.getPrice() < 20) {
                cheapOutputLines.add(product.toString());
            }
        }
        try {
            Files.write(cheapOutputPath, cheapOutputLines);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output average and price range
        if (count > 0) {
            int averagePrice = total / count;
            System.out.println("Average Price: " + averagePrice + " Euro");
            System.out.println("Price Range: between " + minPrice + " Euro and " + maxPrice + " Euro");
        }
    }
}

