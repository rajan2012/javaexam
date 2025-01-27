import java.util.Scanner;

public class main2 {

    public static double[] arrreturn(double[][] a){

        double maxtemp = a[0][0];
        double avg = 0;
        int count = 0;
        double sum = 0;
        int maxtempmonth = 1;

        for(int i=0; i<a.length;i++){

            for(int j=0;j<a[i].length;j++){

             if(a[i][j]> maxtemp){
                 maxtemp =a[i][j];
                 maxtempmonth = i+1;
             }
              sum = sum + a[i][j];
              count++;

            }

        }
        avg = sum/count;
        return new double[]{avg,maxtempmonth};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] a = {{1, 4, 5, 6},
                {2, 7, 19, 21},
                {1, 3, 5, 7}, {1, 3, 5, 7}, {2, 28, 3, 7}, {1, 3, 8, 3},
                {1, 9, 5, 26},
                {2, 7, 19, 21},
                {1, 23, 5, 17}, {11, 3, 15, 7}, {22, 8, 13, 7}, {1, 13, 8, 23}};


        double[] results = arrreturn(a);
        double avgTemperature = results[0];
        int monthOfMaxTemp = (int) results[1];
        System.out.println("The average temperature is: " + avgTemperature);
        System.out.println("The month with the highest temperature is: " + monthOfMaxTemp);

    }

}
