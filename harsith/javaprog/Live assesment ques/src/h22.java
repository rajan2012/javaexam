import java.util.Scanner;

public class h22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i;
        int n = sc.nextInt();

        int[] ar = new int[n];
        int barrier = sc.nextInt();

        for(i=0; i<n; i++){

            ar[i] = sc.nextInt();

        }

        for(i=0; i<n; i++){

            if(barrier < ar[i]){
                System.out.println("index are"+i);
            }



        }



    }


}
