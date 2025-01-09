import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {

    // Method to read the file
    public static List<String> readFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);

        return Files.readAllLines(path); // Read all lines from the file
    }

    public static List<String> readf(String filename) throws IOException
    {
        Path p= Paths.get(filename);
        List<String> lines =  Files.readAllLines(p);

        File f= new File(filename);

        BufferedReader b=new BufferedReader(new FileReader(filename));

        b.readLine();

        FileWriter f2=new FileWriter(filename);

        //f2.write(data);
        //Files.write(p,data);

        return lines;


    }



    // Method to write data back to the file
    public static void writeFile(String filePath, List<String> data) throws IOException {
        Path path = Paths.get(filePath);
        Files.write(path, data); // Write the updated data to the file
    }

    // Method to replace location based on name
    public static void replaceLocation(String filePath, String targetName, String newLocation) throws IOException {
        List<String> lines = readFile(filePath);
        List<String> updatedLines = new ArrayList<>();

        for (String line : lines) {
            String[] columns = line.split(","); // Split by comma
            if (columns[0].equals(targetName)) {
                columns[2] = newLocation; // Replace the location
            }
            updatedLines.add(String.join(",", columns)); // Rejoin columns into a line
        }

        writeFile(filePath, updatedLines); // Write the updated lines back to the file
    }

    public static void replf(String filename,String name,String loca) throws IOException
    {
        List<String> l=readFile(filename);

        List<String> l3=new ArrayList<>();

        for(String l2:l)
        {
            String[] s=l2.split(",");
            if(s[0].equals(name))
            {
                s[2]=loca;
            }
            l3.add(String.join(",",s));
        }

        writeFile(filename,l3);
    }

    // Method to delete row with specific name
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

    // Method to read and print lines from the file
    public static void printFileLines(String filePath) throws IOException {
        List<String> lines = readFile(filePath);
        for (String line : lines) {
            System.out.println(line); // Print each line
        }
    }

    // Method to add new data to the file using Scanner
    public static void addDataUsingScanner(String filePath) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        System.out.println("Enter location:");
        String location = scanner.nextLine();

        // Read the existing data from the file
        List<String> lines = readFile(filePath);
        // Add new data to the file
        lines.add(name + "," + age + "," + location);

        // Write the updated data to the file
        writeFile(filePath, lines);

        System.out.println("Data added successfully.");
    }

    public static void createfile(String filename) throws IOException
    {
        File f=new File(filename);

        Path p=Paths.get(filename);

      if(!Files.exists(p))
      {
         Files.createFile(p);
      }
    }

    public static void main(String[] args) {
        String filePath = "data.txt"; // Specify the file path

        try {
            // Add a new person to the file
            createfile(filePath);
            addDataUsingScanner(filePath);

            // Print file content
            System.out.println("File content:");
            printFileLines(filePath);

            // Replace location of a specific person
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
