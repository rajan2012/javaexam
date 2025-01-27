import java.util.HashMap;
import java.util.Map;

public class AthleteTimeTracker {

    public static void addTime(String line, Map<String, Integer> records){

        String[] parts = line.split(":");
        String name = parts[0];
        int time = Integer.parseInt(parts[1]);


        if(records.containsKey(name)){
            if(time< records.get(name)){
                records.put(name, time);
            }
        }
        else{
            records.put(name, time);
        }

    }
    public static void main(String[] args) {
        // Example usage
        Map<String, Integer> records = new HashMap<>();

        addTime("Peter:120", records);
        addTime("Peter:110", records);
        addTime("Katja:115", records);
        addTime("Peter:111", records);

        // Printing the final records to see the result
        for (Map.Entry<String, Integer> entry : records.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
