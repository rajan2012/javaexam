import java.util.Scanner;

public class main5 {

    static int calcGCF(int a, int b){

        if(b==0){
            return a;
        }
        else return calcGCF(b, a%b);
    }


    public static void main(String[] args) {
        // Example usage
        int num1 = 30;
        int num2 = 18;
        System.out.println("The GCF of " + num1 + " and " + num2 + " is: " + calcGCF(num1, num2));
    }
}
