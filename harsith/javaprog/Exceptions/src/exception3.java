//Winter-2018 You get strings of the form “1234;Harry Potter; This is a book”, the first number should be passed
//represent the isbn number, the middle part is the name of the book and the last substring is a
//Comment. For each input, the output should look like this (using an example):
//Isbn: 1234
//Name: Harry Potter
//Abstract: This is a book
//If a substring is empty or there are too few substrings, an exception should be thrown


public class exception3 {

    public static String processBookInfo(String bookInfo) throws IllegalArgumentException {
        // Check if the input is null or empty
        if (bookInfo == null || bookInfo.trim().isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }

        // Split the input string by ";"
        String[] parts = bookInfo.split(";");

        // Check if the string contains exactly three parts
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid input format. Expected format: 'ISBN;Name;Comment'.");
        }

        // Validate ISBN
        String isbn = parts[0].trim();
        if (isbn.isEmpty() || !isbn.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid ISBN format. ISBN must be a numeric value.");
        }

        // Validate Name
        String name = parts[1].trim();
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        // Validate Comment
        String comment = parts[2].trim();
        if (comment.isEmpty()) {
            throw new IllegalArgumentException("Comment cannot be empty.");
        }

        // Constructing the output
        String output = "Isbn: " + isbn + "\nName: " + name + "\nAbstract: " + comment;
        return output;
    }

    public static void main(String[] args) {
        String bookInfo = "1234;Harry Potter;This is a book"; // Example with semicolon-separated ISBN, name, and comment
        try {
            System.out.println(processBookInfo(bookInfo));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
