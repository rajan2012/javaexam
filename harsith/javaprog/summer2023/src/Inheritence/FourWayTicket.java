package Inheritence;

public class FourWayTicket extends BusTicket implements Expirable{
private int ridesLeft;
    public FourWayTicket(String date, double price) {
        super(date, price);
        this.ridesLeft = 4;
    }

    public int getRidesLeft() {

        return ridesLeft;
    }

   public void useTicket(){


    }
}
