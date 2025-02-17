//WINTER-2022
// I think it was about exception handling. The task was to write a class recpet,
//that fulfilled some properties (not complicated). The main part was to define
//a method, that read in a string for a recept, like the following: ”Pizza Hawaii
//10.50”, were the number in the end was the price. So the string should contain
//the Information ”name” + ”price” in exactly this order. The method should
//create an object of class recipe from this information.
//However, the program shall not crush even if the user inputted nonsense,
//like ”Pizza 10.50 Hawaii”.



public class exception1 {

    public static String recpinfo(String recipeInfo) throws IllegalArgumentException {
        // Check if the input is null or empty
        if (recipeInfo == null || recipeInfo.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }

        // Split the input string by any number of whitespaces
        String[] parts = recipeInfo.split("\\s+");

        // Check if there are at least two parts (name and price)
        if (parts.length < 2) {
            throw new IllegalArgumentException("Invalid input format. Please provide a name followed by a price.");
        }

        // Extract name and price from the parts array
        String name = parts[0];
        // Combine all remaining parts to form the full name
        for (int i = 1; i < parts.length - 1; i++) {
            name += " " + parts[i];
        }

        String priceAsString = parts[parts.length - 1];

        // Attempt to parse price as a double
        double price;
        try {
            price = Double.parseDouble(priceAsString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid price format. Price must be a valid number.");
        }

        // Constructing the output
        String output = "Recipe Name: " + name + "\n" + "Price: $" + price;

        return output;
    }

    public static void main(String[] args) {
        String recipeInfo = " Hawai Pizza india 10.50 "; // Example with space-separated name and price
        try {
            System.out.println(recpinfo(recipeInfo));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
