
// Custom exception class
class InvalidDataException extends Exception { // Fixed naming for custom exception
    public InvalidDataException(String message) {
        super(message); // Pass the error message to the superclass constructor
    }
}
