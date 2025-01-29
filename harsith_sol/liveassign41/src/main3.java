public class main3 {

     static int addDigits(String str)
    {
        int sum=0;
        for(char c:str.toCharArray())
        {
            if(Character.isDigit(c))
            {
                //System.out.println("digit is "+c);
                sum+=Character.getNumericValue(c);
                //System.out.println("sum is in if "+sum);
            }
        }

        //System.out.println("sum is "+sum);

       // System.out.println("string conversion of sum is "+String.valueOf(sum));

        return sum;
    }

    static int addDigits2(String str)
    {
        int sum=0;
        for(char c:str.toCharArray())
        {
            if(Character.isDigit(c))
            {
                //System.out.println("digit is "+c);
                //sum+=Integer.parseInt(String.valueOf(c));
               // sum+=Integer.valueOf(String.valueOf(c));
                sum+=Integer.valueOf(c);
                //System.out.println("sum is in if "+sum);
            }
        }

        System.out.println("sum in addDigits2  "+sum);

        // System.out.println("string conversion of sum is "+String.valueOf(sum));

        return sum;
    }

    static boolean containsSum(String str)
    {
        int sum=0;
        for(char c:str.toCharArray())
        {
            if(Character.isDigit(c))
            {
                sum+=Character.getNumericValue(c);
            }
        }

        System.out.println("sum is "+sum);

        return str.contains(String.valueOf(sum));
    }

    public static void main(String[] args) {

       int sum= addDigits("a1b2c3d4e");

        int sum2= addDigits2("a1b2c3d4e");

       System.out.println("in main "+sum);

        System.out.println("in main "+sum2);



        boolean f=containsSum("a1b10c3d4e");

        System.out.println("in main flag "+f);

    }
}