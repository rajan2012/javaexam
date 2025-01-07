// Custom exception class
class AgeException extends Exception { // Fixed naming for custom exception
    public AgeException(String message) {
        super(message); // Pass the error message to the superclass constructor
    }
}