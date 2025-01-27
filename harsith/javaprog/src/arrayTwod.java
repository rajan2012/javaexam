import java.util.Scanner;

public class arrayTwod {


    static int[][] createArray(int[] a){

        int [][] res=new int[a.length][];
        for (int i=0;i<a.length;i++){
            res[i]= new int[a[i]];
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Specify your array: ");
        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int[][] x = createArray(a);

        boolean test = true;
        for (int i = 0; i < x.length; i++) {
            if(x[i].length != a[i]) test = false;
        }

        System.out.println("Result: " + test);
    }











}
