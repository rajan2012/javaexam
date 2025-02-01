import java.io.*;

public class FileIO {

    public static void main(String[] args) {
        makeTextDataI("textI.txt",5);
        makeTextDataII("textII.txt");
    }

    public static void makeTextDataI(String filename, int n){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            int i = 0;
            while(i < n){
                int i1 = (int) (Math.random() * 10);
                int i2 = (int) (Math.random() * 5);
                bw.write(i1 + " " + i2);
                bw.newLine();
                i++;
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeTextDataII(String filename){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            int i = 0;
            while (i < 5) {
                switch (i) {
                    case 0: bw.write("Hallo. "); break;
                    case 1: bw.write("Das war ein Test. "); break;
                    case 2: bw.write("Es sind die ersten Grundlagen der FileI/O behandelt. "); break;
                    case 3: bw.write("Du hast es hierhin geschafft. "); break;
                    case 4: bw.write("Jetzt hast du ein Gefühl für die Materie."); break;
                }
                bw.newLine();
                i++;
            }
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
