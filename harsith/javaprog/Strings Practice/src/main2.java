import java.util.Scanner;

public class main2 {

    public static int addDigits(String str){

        int sum=0;

        for(int i=0; i<str.length();i++){

            char ch = str.charAt(i);
            if(Character.isDigit(ch)){

                sum = sum + Integer.parseInt(String.valueOf(ch));

            }
        }

          return sum;

}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int sum = addDigits(str);



         System.out.println("The value " + sum );

    }
}

