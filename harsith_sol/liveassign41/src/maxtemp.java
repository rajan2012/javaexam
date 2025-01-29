

public class maxtemp {
    public static void main(String[] args) {
        // 2D array representing temperatures for 12 months
        // Each row represents a month, and each column represents different temperature readings
        int[][] temperatures = {
                {30, 32, 35, 33, 31}, // January
                {28, 29, 27, 30, 31}, // February
                {35, 36, 38, 37, 39}, // March
                {40, 42, 41, 39, 38}, // April
                {45, 44, 46, 47, 43}, // May
                {35, 36, 34, 37, 38}, // June
                {30, 32, 31, 33, 34}, // July
                {39, 41, 40, 42, 38}, // August
                {29, 31, 30, 28, 32}, // September
                {22, 24, 25, 23, 26}, // October
                {18, 19, 20, 21, 22}, // November
                {15, 16, 14, 17, 18}  // December
        };

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        int maxTemperature = Integer.MIN_VALUE;
        String hottestMonth = "";
        double[] avgTemperatures = new double[12];

        // Find the month with the highest temperature and calculate average temperatures
        for (int i = 0; i < temperatures.length; i++) {
            int sum = 0;
            int maxInMonth = Integer.MIN_VALUE;

            for (int temp : temperatures[i]) {
                sum += temp;
                if (temp > maxTemperature) {
                    maxTemperature = temp;
                    hottestMonth = months[i];
                }
                if (temp > maxInMonth) {
                    maxInMonth = temp;
                }
            }

            avgTemperatures[i] = sum / (double) temperatures[i].length; // Calculate average
        }

        // Display results
        System.out.println("The hottest month is: " + hottestMonth + " with a maximum temperature of " + maxTemperature + "°C.");
        System.out.println("\nAverage temperatures for each month:");
        for (int i = 0; i < avgTemperatures.length; i++) {
            System.out.printf("%-10s: %.2f°C%n", months[i], avgTemperatures[i]);
        }
    }
}

