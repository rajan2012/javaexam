public class IllegalException extends Exception{

    IllegalException(int number)
    {
        super("illegal input "+number);
    }
}
