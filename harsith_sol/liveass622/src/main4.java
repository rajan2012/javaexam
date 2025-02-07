import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main4 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"))) {
            writer.write("Hello, this is a sample text file!");
            writer.newLine(); // Adds a new line
            writer.write("BufferedWriter Example in Java.");
            writer.newLine();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

