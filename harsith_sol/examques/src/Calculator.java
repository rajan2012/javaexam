public class Calculator {


    int sum(int[] numbers) throws IllegalArgumentException
    {
        int sum=0;
        for(int i:numbers)
        {
            if(i<0)
            {
                throw new IllegalArgumentException("only non negative integers");
            }
            sum+=i;
        }

        return sum;
    }

}
