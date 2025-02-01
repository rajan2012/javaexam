import java.util.Scanner;

public class Evaluation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String current = sc.nextLine();

        System.out.println(Parser.createClient(current));
    }
 
}
