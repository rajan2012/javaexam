import java.util.Scanner;

public class h42 {

    public static String reverse(String string){

        if (string.isEmpty()) {
            return null;
        }

        return reverse(string.substring(1)) + string.charAt(0);
        
    }



    public class Exercise {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("String: ");
            String string = sc.nextLine();

            String result = reverse(string);
            System.out.println("Result: " + result);
        }
    }



}
