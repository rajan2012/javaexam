import java.util.Scanner;

public class main2 {

    String model;
    int year;
    boolean isElectric;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //int height = sc.nextInt();
       // int width = sc.nextInt();

        int per = perimeter( 15,  10);
        int ar  = area(15,  10);

        String model;
        int year;
        boolean isElectric;

        System.out.println("Perimeter is "+per);
        System.out.println("area is "+ar);

        main2 car1 = new main2("Model X", 2020, true);
        car1.displaycar();
    }

    public static int perimeter (int height, int width){

        return 2*(height+width);

    }
    public static int area (int height, int width){
        return height*width;
    }

    public main2 (String model,int year,boolean isElectric){

        this.model = model;
        this.year = year;
        this.isElectric = isElectric;

    }

    public void displaycar (){

        System.out.println("model:"+model);
        System.out.println(year);
        System.out.println(isElectric);

    }


}
