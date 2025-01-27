
//avg or anything asked for all the or each rows to be in output then use


public class arraymaxavg {

    public static int indexOfHottestMonth(double[][] temperatures){

        double sumavg = 0;

        for(int j=0; j<temperatures[0].length;j++){

            sumavg = sumavg + temperatures[0][j];
        }

         double avg = sumavg/temperatures[0].length;
        int indexOfMonthWithMaxAverage = 0;

        for(int i=0;i<temperatures.length;i++){

            double sum=0;

            for(int j=0; j<temperatures[i].length;j++){

                sum = sum + temperatures[i][j];

            }
            double avgtot = sum/temperatures[i].length;
            if(avgtot>avg){

                avg = avgtot;
                indexOfMonthWithMaxAverage =i;
            }

        }

          return indexOfMonthWithMaxAverage;
    }



    public static void main(String[] args) {
        // Example 2D array containing temperatures for each month from January to December
        // for 5 years (2019-2023). Each row represents a month, and each column represents a year.
        double[][] temperatures = {
                {30, 31, 32, 33, 34}, // January
                {29, 30, 31, 32, 33}, // February
                {28, 29, 30, 31, 32}, // March
                {27, 28, 29, 30, 31}, // April
                {26, 27, 28, 29, 30}, // May
                {25, 26, 27, 28, 29}, // June
                {24, 25, 26, 27, 28}, // July
                {23, 24, 25, 26, 27}, // August
                {22, 23, 24, 25, 26}, // September
                {21, 22, 23, 24, 25}, // October
                {20, 21, 22, 23, 24}, // November
                {19, 20, 21, 22, 23}  // December
        };

        int hottestMonthIndex = indexOfHottestMonth(temperatures);
        System.out.println("The index of the month with the highest average temperature is: " + hottestMonthIndex);
        // Adding 1 to make it more human-readable (January = 1, February = 2, etc.)
        System.out.println("Corresponding to the month: " + (hottestMonthIndex + 1));


    }


}
