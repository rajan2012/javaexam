//WINTER-2023
// Giving classes, you have to construct
//class base on the instruction in paper. Create
//some method like add student but from string
//3 1234;Name;1231
//Have to break down the string to get variable
//to add to the function
//Also you have to create an exception to
//avoid some situation mentioned in question



public class exception2 {

    public static String studentinfo (String stinfo) {

        if(stinfo==null || stinfo.trim().isEmpty()){

            throw new IllegalArgumentException();
        }

        String[] parts = stinfo.split(";");

        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid input format. Expected format: 'ID;Name;Score'.");
        }

        int id;

        try{
            id = Integer.parseInt(parts[0]);
        }
        catch (Exception e) {

            throw new IllegalArgumentException("Invalid ID format. ID must be an integer.");
        }
        String name = parts[1].trim();

        if(name.isEmpty()){

            throw new IllegalArgumentException("Name cannot be empty.");

        }
        String score = parts[2].trim();

        if(!score.matches("\\d+(\\.\\d+)?")){

            throw new IllegalArgumentException("Invalid score format. Score must be a numeric value.");

        }

        String output = "Student ID: " + id + ", Name: " + name + ", Score: " + score;
        return output;

    }



    public static void main(String[] args){

        String stinfo = "1234;John Doe;88.5"; // Example with semicolon-separated ID, name, and score
        try {
            System.out.println(studentinfo(stinfo));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
