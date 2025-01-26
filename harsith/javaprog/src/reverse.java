import java.util.Scanner;

public class reverse {

    @Override
    public String toString() {
        return "reverse{}";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String rev = "";

        for(int i=0; i< str.length();i++){

            rev = str.charAt(i) + rev;

        }

        System.out.println("reverse is:" + rev);


    }


    }


