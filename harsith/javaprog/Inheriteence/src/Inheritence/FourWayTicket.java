package Inheritence;

public class FourWayTicket extends BusTicket implements Expirable{

    private int ridesLeft;

    public FourWayTicket(String date, double price) {
        super(date, price);
        this.ridesLeft = 4; // Assuming 'FourWayTicket' always starts with 4 rides
    }

    public int getRidesLeft() {
        return ridesLeft;
    }

    public void useTicket() {
        if (ridesLeft > 0) {
            ridesLeft--;
        } else {
            System.out.println("No rides left.");
        }
    }
}
