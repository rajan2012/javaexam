import java.io.*;
import java.util.*;

public class another {

    // Method to read the file line by line
    public static List<String> readFile(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line); // Add each line to the list
            }
        }
        return lines;
    }

    // Method to write data back to the file
    public static void writeFile(String filePath, List<String> data) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine(); // Add a new line after each entry
            }
        }
    }

    // Method to replace location based on name
    public static void replaceLocation(String filePath, String targetName, String newLocation) throws IOException {
        List<String> lines = readFile(filePath);
        List<String> updatedLines = new ArrayList<>();

        for (String line : lines) {
            String[] columns = line.split(",");
            if (columns[0].equals(targetName)) {
                columns[2] = newLocation; // Replace the location
            }
            updatedLines.add(String.join(",", columns)); // Rejoin columns into a line
        }

        writeFile(filePath, updatedLines); // Write the updated lines back to the file
    }

    // Method to delete a row with a specific name
    public static void deleteRow(String filePath, String nameToDelete) throws IOException {
        List<String> lines = readFile(filePath);
        List<String> updatedLines = new ArrayList<>();

        for (String line : lines) {
            String[] columns = line.split(",");
            if (!columns[0].equals(nameToDelete)) {
                updatedLines.add(line); // Add only lines where the name doesn't match
            }
        }

        writeFile(filePath, updatedLines); // Write the updated lines back to the file
    }

    // Method to print file content
    public static void printFileLines(String filePath) throws IOException {
        List<String> lines = readFile(filePath);
        for (String line : lines) {
            System.out.println(line); // Print each line
        }
    }

    // Method to add new data using Scanner
    public static void addDataUsingScanner(String filePath) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.println("Enter location:");
        String location = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) { // Append mode
            writer.write(name + "," + age + "," + location);
            writer.newLine();
        }

        System.out.println("Data added successfully.");
    }

    public static void main(String[] args) {
        String filePath = "data.txt"; // Specify the file path

        try {
            // Add new person to the file
            addDataUsingScanner(filePath);

            // Print file content
            System.out.println("File content:");
            printFileLines(filePath);

            // Replace location for a specific person
            replaceLocation(filePath, "Alice", "Los Angeles");

            // Delete a row for a specific person
            deleteRow(filePath, "Bob");

            // Print file content again after modifications
            System.out.println("\nUpdated File content:");
            printFileLines(filePath);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
