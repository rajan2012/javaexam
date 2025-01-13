import java.util.*;

public class Dice {


    public Dice()
    {
       // throwDice();
    }
    int a=0;

    public void throwDice()
    {
        Random random=new Random();

         a =random.nextInt(6)+1;

    }

    public int pips()
    {
        return a;
    }

    public static int pipsum(Dice d1, Dice d2)
    {
        return d1.pips()+d2.pips();
    }
}
