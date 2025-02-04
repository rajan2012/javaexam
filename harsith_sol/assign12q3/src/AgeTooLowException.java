public class AgeTooLowException extends Exception {

    AgeTooLowException(String message, int age)
    {
        super(message+" "+age);
    }
}
