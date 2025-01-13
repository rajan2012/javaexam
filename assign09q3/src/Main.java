//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dice d = new Dice();

        d.throwDice();

        System.out.println( d.pips() );

        System.out.println( Dice.pipsum(d, d) );

        Mia game = new Mia();



      //  System.out.println(d1);

        System.out.println("after mia"+ Dice.pipsum(d, d) );

        System.out.println("game "+ game.valueAndThrowDice() );

        System.out.println(Mia.isMia (21) );
        System.out.println(Mia.isDouble (22) );
        System.out.println(Mia.isLess (11, 43) );

    }
}