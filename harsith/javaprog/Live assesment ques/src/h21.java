import java.util.Scanner;

public class h21 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int i;
        int n = sc.nextInt();

        int[] ar = new int[n];

        for(i=0; i<n; i++){

            ar[i] = sc.nextInt();

        }

        for(i=n-1;i<n;i--){

            System.out.println(ar[i]);


        }


    }

}
