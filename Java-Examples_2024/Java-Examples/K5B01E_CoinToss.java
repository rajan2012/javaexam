public class K5B01E_CoinToss {
   private final int HEADS = 1;
   private final int TAILS = 0;
   private int upside;

   public K5B01E_CoinToss () {
      toss();
   }
   public void toss () {
      upside = (int) (Math.random() * 2);
   }
   public boolean isHeads () {
      return (upside == HEADS);
   }
   public String toString() {
      String top;
      if (upside == HEADS) top = "HEADS";
      else top = "TAILS";
      return top;
   }
}
