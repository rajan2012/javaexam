import java.util.Scanner;

public class h23 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int i;
        int n = sc.nextInt();

        int[] ar = new int[n];
        int count=0;

        for(i=0; i<n; i++){

            ar[i] = sc.nextInt();


        }


        for(i=0; i<n; i++){

           if(ar[i] == i ){

               count++;

           }

        }
        System.out.println(count);

    }
}
