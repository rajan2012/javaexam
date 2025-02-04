import java.util.Scanner;

public class main2 {

    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        switch(a)
        {
            case 1:System.out.println("its 1");
                   break;

            case 2:System.out.println("its 2");
                break;

            case 3:System.out.println("its 3");
                break;

            case 4:System.out.println("its 4");
                break;

            default:System.out.println("its default");
                break;
        }
    }
}
