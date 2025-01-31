import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String str = "This is a good password";

        String[] words = str.split(" ");

        StringBuilder op = new StringBuilder();

        for(int i=0; i< words.length;i++){

            op.append(words[i].charAt(0));


        }

        System.out.println(op.toString());



    }



}
