import java.util.Scanner;

public class Main {

            static int cs(int n){

                if( n >= 0 && n<10 ){
                   return n;

                }

                else
                    return n%10 + cs(n/10);

            }



    public static void main(String[] args) {
        int n = 12345;

       int res = cs(n);

       System.out.println(res);
    }
}