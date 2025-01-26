import java.util.Scanner;


public class main3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("max num" +max3(x,y,z));

    }

    public static int max(int x, int y){
        return Math.max(x, y);
    }

    public static int max3 (int x, int y, int z){
        return max (x,max(y,z));
    }



}
