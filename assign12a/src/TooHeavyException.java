

public class TooHeavyException extends Exception{

    double overweight;
    public TooHeavyException(double weight)
    {
        if(weight>15) {
             this.overweight=weight-15;


           // System.out.println(e.getMesage());
        }
    }

    String getErrMsg()
    {
       return "Exception: Dogs with overweight don’t go for walks";

    }
}

