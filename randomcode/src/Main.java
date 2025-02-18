import javax.imageio.IIOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void readFile(String filename)throws IOException
    {
        BufferedReader sb=new BufferedReader(new FileReader(filename));

        String l;
        System.out.println("file reading method");
        while((l=sb.readLine())!=null)//very imp to call like this
        {
            //l=sb.readLine(); --if do here print null since after last line it goes there and
            //skip one line each time

            System.out.println(l);
        }


    }

    public static void readFile2(String filename) throws IOException {
        BufferedReader sb = new BufferedReader(new FileReader(filename));

        String l;
        while ((l = sb.readLine()) != null) {  // Read the line in the condition itself
            System.out.println("file reading method");
            System.out.println(l);  // Print the content of the line
        }
    }


    public static void updateFile2(String filename) throws IOException
    {
        Path p= Paths.get(filename);

        List<String> l2= Files.readAllLines(p);

        List<String> l=new ArrayList<>();

        String oldcontent="rajan";
        for(String l3:l2)
        {
            int a=Integer.valueOf(l3);
            System.out.println("inside update file"+a);
            if(a%2==0)
            {
                l.add(String.valueOf(a));
            }

        }

        Files.write(p,l);
    }


    public static void updateFile(String filename) throws IOException
    {
        Path p= Paths.get(filename);

        List<String> l2= Files.readAllLines(p);

        List<String> l=new ArrayList<>();

        String oldcontent="rajan";

        for(String l3:l2)
        {
            if(l3.contains(oldcontent))
            {
                l.add("sah");
            }
            else
            {
                l.add(l3);
            }
        }

        Files.write(p,l);

    }

    public static void writeFile(String filename) throws IOException
    {
        //try (FileWriter f = new FileWriter(filename))
       // in 2 line
        FileWriter f=null;
        try{
             f = new FileWriter(filename,true);
            Scanner sc = new Scanner(System.in);

            for(int i=0;i<2;i++) {
                //String l = sc.nextLine();
                //f.write(l+System.lineSeparator());
                int l = sc.nextInt();
                f.write(String.valueOf(l)+System.lineSeparator());
            }
        }
        finally
        {
            if(f!=null)
            {
                f.close();
            }
        }

    }

    public static void deleteLineFromFile(String filename, String lineToDelete) throws IOException {
        Path path = Paths.get(filename);

        // Read all lines from the file
        List<String> lines = Files.readAllLines(path);

        // Remove the line that matches the content
        lines.removeIf(line -> line.equals(lineToDelete));

        // Write the updated list back to the file
        Files.write(path, lines);
    }

    public static void writeFile2(String filename) throws IOException {
        try (FileWriter f = new FileWriter(filename)) {

            Scanner sc = new Scanner(System.in);

            String l = sc.nextLine();
            f.write("rajan");


        }
    }

    public static void createfile(String filename) throws IOException {
        File f=new File(filename);

        if(f.exists())
        {
            System.out.println("file exist");
        }
        else
        {
            f.createNewFile();
        }
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       String a="example.txt";

        try
        {
            createfile(a);
            writeFile(a);
            readFile(a);
            //readFile2(a);
           // updateFile(a);
            updateFile2(a);
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }



        }
    }
