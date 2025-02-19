import java.util.Map;

public class main2 {

    public static void addTime(String line, Map<String, Integer> records) {

        // Step 1: Split the input string into the name and time components
        String[] parts = line.split(":");

        if (parts.length != 2) {
            // Invalid input, so return without doing anything
            return;
        }

        String name = parts[0].trim(); // Athlete's name
        int time;

        try {
            time = Integer.parseInt(parts[1].trim()); // Time (converted to an integer)
        } catch (NumberFormatException e) {
            // If time is not a valid integer, return without doing anything
            return;
        }

        // Step 2: Check if the map already has an entry for the athlete
        if (records.containsKey(name)) {
            // Step 3: Compare the current time with the stored time
            int currentBestTime = records.get(name);
            if (time < currentBestTime) {
                // Step 4: Update the map with the new best time
                records.put(name, time);
            }
        } else {
            // Step 5: Add a new entry if the athlete is not already in the map
            records.put(name, time);
        }
    }

    public static void main(String[] args) {
        // Example usage
        Map<String, Integer> records = new java.util.HashMap<>();

        addTime("Peter:120", records);
        addTime("Peter:110", records);
        addTime("Katja:115", records);
        addTime("Peter:111", records);

        System.out.println(records); // Output: {Peter=110, Katja=115}
    }
}
