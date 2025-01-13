import java.util.*;

public class Mia {

 private Dice d1, d2;


 public Mia() {
         d1 = new Dice();
         d2 = new Dice();
 }

    public int valueAndThrowDice()
    {
        int currentValue = calculateValue(d1.pips(), d2.pips());
        d1.throwDice(); // Throw the dice again
        d2.throwDice(); // Throw the dice again
        return currentValue;


    }


    public static boolean isDouble(int value)
    {
      return (value/10==value%10);
    }

    public static boolean isLess(int a, int b)
    {
       return a<b?true:false;
    }

    public static boolean isMia(int value) {
        return value == 21;
    }

    private int calculateValue(int pip1, int pip2) {
        if (pip1 > pip2) {
            return pip1 * 10 + pip2; // Higher pip becomes the tens digit
        } else {
            return pip2 * 10 + pip1; // Higher pip becomes the tens digit
        }
    }

}
