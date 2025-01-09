import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String filePath = "example.txt";

        try {
            // 1. Create or Open a File
            createFile(filePath);

            // 2. Write Data to the File
            writeToFile(filePath, "Hello, World!\nThis is a file manipulation example.\n");

            // 3. Read Data from the File
            System.out.println("File Content:");
            readFile(filePath);

            // 4. Update a Line in the File
            updateFile(filePath, "This is a file manipulation example.", "This line has been updated!");

            // 5. Read Updated File
            System.out.println("\nUpdated File Content:");
            readFile(filePath);

            // 6. Delete the File
           // deleteFile(filePath);
           // System.out.println("\nFile deleted successfully!");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to create or open a file
    public static void createFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists: " + file.getName());
        }
    }

    // Method to write data to a file
    public static void writeToFile(String filePath, String data) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(data);
            System.out.println("Data written to file.");
        }
    }

    // Method to read data from a file
    public static void readFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((reader.readLine()) != null) {
                line=reader.readLine();
                System.out.println(line);
            }
        }
    }

    // Method to update a specific line in a file
    public static void updateFile(String filePath, String oldLine, String newLine) throws IOException {
        Path path = Paths.get(filePath);
        List<String> lines = Files.readAllLines(path);
        List<String> updatedLines = new ArrayList<>();

        for (String line : lines) {
            if (line.equals(oldLine)) {
                updatedLines.add(newLine);
            } else {
                updatedLines.add(line);
            }
        }

        Files.write(path, updatedLines);
        System.out.println("File updated successfully.");
    }

    // Method to delete a file
    public static void deleteFile(String filePath) throws IOException {
        File file = new File(filePath);


        if (file.delete()) {
            System.out.println("Deleted file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
