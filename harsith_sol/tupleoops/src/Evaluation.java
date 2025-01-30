public class Evaluation {

    double squareDiv(double a,double b) throws ArithmeticException
    {
        double c=0.0;
        try {
            c = a / Math.pow(b, 2);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        return c;

    }

    double squareDiv2(double a,double b) throws ArithmeticException
    {
        double c=0.0;
        if(b==0)
        {
            throw new ArithmeticException("b is not allowed to be zero");

        }
        c = a / Math.pow(b, 2);

        return c;

    }

}
