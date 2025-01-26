import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = "This is a good password";
        String[] words = str.split(" ");

        String op = "";


        for (int i = 0; i < words.length; i++) {


            op+= words[i].charAt(0) ;


        }
        for(String var: words){
            System.out.println(var.charAt(0));
        }
        System.out.println(op);

    }


}
