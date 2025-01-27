import java.util.Scanner;

public class adddig {

    public static int addDigits(String str) {


        int sum = 0;
        //char[] ch = str.toCharArray();
        //can be done in both ways character array and using char ch = str.charAt(i);

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                sum = sum + Integer.parseInt(String.valueOf(str.charAt(i)));
            }

        }
        return sum;
    }

    public static boolean containsSum(String str){

       int sum = addDigits(str);
       // No need to adjust the sum calculation here.

        // Convert the sum back to a string so we can check if the original string contains this substring.
        String sumAsString = String.valueOf(sum);

        // Check if the original string contains the sum as a substring.
        return str.contains(sumAsString);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean bool = containsSum(str);

        if(bool) System.out.println("The value " + addDigits(str) + " is contained in the string");
        else System.out.println("The value " + addDigits(str) + " is not contained in the string");

    }

}
