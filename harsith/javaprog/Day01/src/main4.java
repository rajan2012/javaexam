import java.util.Scanner;

public class main4 {

    static double frec(int val) {

        if (val == 0) {
            return 0;
        } else if (val == 1) {
            return 2;
        } else if (val == 2) {
            return 4;
        } else return (frec(val - 1) + frec(val - 2)) * frec(val - 3);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Selections: ");
        int test = sc.nextInt();
        System.out.print("Value: ");
        int value = sc.nextInt();

        if (test == 1) {
            System.out.print("frec(" + value + ") = ");
            System.out.println(frec(value));
        } else {
            System.out.print("fdyn(" + value + ") = ");
           // System.out.println(fdyn(value));
        }
    }
}