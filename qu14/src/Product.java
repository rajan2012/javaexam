import java.io.*;
import java.util.*;

public class Product {
    private String artno;
    private String name;
    private int price;

    // Constructor to parse and initialize a Product from a line
    public Product(String line) {
        String[] parts = line.split(",");
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

        String inputFileName = "Productlist.txt";
        String modFileName = "ModProductlist.txt";
        String cheapFileName = "CheapProducts.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                products.add(new Product(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write data to ModProductlist.txt in a fixed format
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(modFileName))) {
            for (Product product : products) {
                bw.write(product.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write CheapProducts.txt and calculate statistics
        int total = 0, count = 0, minPrice = Integer.MAX_VALUE, maxPrice = Integer.MIN_VALUE;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(cheapFileName))) {
            for (Product product : products) {
                total += product.getPrice();
                count++;
                minPrice = Math.min(minPrice, product.getPrice());
                maxPrice = Math.max(maxPrice, product.getPrice());

                if (product.getPrice() < 20) {
                    bw.write(product.toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output average and price range
        if (count > 0)
        {
            int averagePrice = total / count;
            System.out.println("Average Price: " + averagePrice + " Euro");
            System.out.println("Price Range: between " + minPrice + " Euro and " + maxPrice + " Euro");
        }
    }
}
