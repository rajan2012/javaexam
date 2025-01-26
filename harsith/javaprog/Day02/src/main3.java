public class main3 {
    public static double[] calculateRowAverages(double[][] temperatures) {

        double[] avg = new double[temperatures.length];

        for(int i=0; i< temperatures.length;i++){
            double sum =0;
            for(int j=0; j< temperatures[i].length;j++){

                sum = sum + temperatures[i][j];
            }

            avg[i] = sum/ temperatures[i].length;
        }

return avg;

    }

    public static void main(String[] args) {
        double[][] temperatures = {
                {30.5, 32.5, 35.5, 40.0, 45.0, 50.5, 55.5, 60.0, 55.5, 50.0, 45.5, 40.0}, // Temperatures for year 1
                {31.0, 33.0, 36.0, 41.0, 46.0, 51.0, 56.0, 61.0, 56.0, 51.0, 46.0, 41.0}  // Temperatures for year 2
        };

        double[] averages = calculateRowAverages(temperatures);

        for (double average : averages) {
            System.out.println(average);
        }
    }

}
