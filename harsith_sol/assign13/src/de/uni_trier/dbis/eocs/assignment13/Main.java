package de.uni_trier.dbis.eocs.assignment13;

import optimizers.address.AddressOptimizer;
import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = "addresses.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                AddressOptimizer optimizer = new AddressOptimizer(line);
                List<String> result = optimizer.optimize();

                if (result.isEmpty()) {
                    System.out.println("empty result");
                } else {
                    for (String part : result) {
                        System.out.println(part);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

