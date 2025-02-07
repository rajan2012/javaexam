public class K5B01E_HeadsOrTails {
   public static void main (String[] args) {
      final int NUMBER_THROWS = 1000;
      int heads = 0, tails = 0;

      K5B01E_CoinToss myCoin
                          = new K5B01E_CoinToss(); 
      for (int count=1; count <= NUMBER_THROWS; count++) {
         myCoin.toss();
         if (myCoin.isHeads()) 
            heads++;
         else
            tails++;
      }
      System.out.println(
            "In " + NUMBER_THROWS + " throws we had "
             + heads + " times heads and " 
             + tails + " times tails.");
   }
}
