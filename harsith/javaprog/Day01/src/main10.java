import java.util.Scanner;

public class main10 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number with at least two digits: ");
        int x = scanner.nextInt(); // Read the user input

        int invertedNumber = 0;
        invertedNumber = invertNumber(x, 0);
        System.out.println("Inverted number: " + invertedNumber);


        while (x>0){

            int lastdigi = x%10;
            invertedNumber = invertedNumber * 10 + lastdigi;
            x = x/10;

        }

       System.out.println(invertedNumber);
    }

    private static int invertNumber(int number, int inverted) {

        if (number == 0) {
            return inverted;
        } else {
            return invertNumber(number/10,inverted*10+number%10);
        }
    }
}
