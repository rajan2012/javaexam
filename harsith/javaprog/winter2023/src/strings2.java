import java.util.Scanner;

public class strings2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "This is a good password";
        StringBuilder sb = new StringBuilder();

        String[] res = str.split("\\s+");
        String op = " ";

        for(int i=0; i< res.length;i++){

           op = op + res[i].charAt(0);

        }
        System.out.println(op.trim());
        


        //using string builder append function;



        for(int i= res.length-1; i>=0;i--){

            sb.append(res[i].charAt(0));

        }

        System.out.println(sb.reverse().substring(0,1));
    }
}
