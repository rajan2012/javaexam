package Inheritence02;

public class FourWayTicket extends BusTicket implements Expirable{

private int tripsremaining;

    public FourWayTicket(String date, double price) {
        super(date, price);
        this.tripsremaining = 4;
    }

    @Override
    public void useTicket() {

        if(tripsremaining>0){
            tripsremaining--;
        }

    }

    @Override
    public int getRidesLeft() {

        return tripsremaining;
    }
}
