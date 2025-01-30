class CustomerParser extends Customer {

    // Constructor takes a raw line and parses it
    public CustomerParser(String line) {
        super("", "", ""); // Call superclass constructor with empty values
        parse(line); // Parse the input line
    }

    // Method to parse a line in the format "Name,Street,City"
    private void parse(String line) {
        String[] parts = line.split(",");
        if (parts.length == 3) { // Ensure valid data
            this.name = parts[0].trim();
            this.street = parts[1].trim();
            this.city = parts[2].trim();
        } else {
            System.out.println("Invalid input format!");
        }
    }
}
