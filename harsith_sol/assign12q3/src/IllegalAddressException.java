public class IllegalAddressException extends Exception {

    public IllegalAddressException(String message, String address)
    {
        super(message+" "+address);
    }
}
