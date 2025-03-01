public class TaskArrays {
    public static String[] predictPrice(String[] products, int[][] harvests) {
        String[] predictions = new String[products.length];

        for (int i = 0; i < products.length; i++) {
            int yearsAvailable = harvests[i].length - 1; // Exclude current year
            int currentYearHarvest = harvests[i][0]; // First column is this year's harvest

            // Calculate average of last 5 years or available years
            int sum = 0, count = 0;
            for (int j = 1; j <= Math.min(5, yearsAvailable); j++) {
                sum += harvests[i][j];
                count++;
            }
            double avgHarvest = (double) sum / count;

            // Calculate percentage change
            double change = ((currentYearHarvest - avgHarvest) / avgHarvest) * 100;

            // Predict price based on change
            if (change >= 10) {
                predictions[i] = products[i] + ": drop";
            } else if (change <= -10) {
                predictions[i] = products[i] + ": raise";
            } else {
                predictions[i] = products[i] + ": same";
            }
        }

        return predictions;
    }

    public static void main(String[] args) {
        String[] products = {"Potatoes", "Oranges", "Rice"};
        int[][] harvests = {
                {250, 120, 50, 520, 110, 90, 100, 105, 410}, // Potatoes
                {85, 95, 110, 0, 45}, // Oranges (only 4 years available)
                {230, 280, 170, 55, 660, 390} // Rice
        };

        String[] result = predictPrice(products, harvests);
        for (String res : result) {
            System.out.println(res);
        }
    }
}
