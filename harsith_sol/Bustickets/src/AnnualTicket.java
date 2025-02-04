public class AnnualTicket extends BusTicket implements Expirable {

    String name;

    int noofrideleft;
    public AnnualTicket(String date, double price, String name)
    {
        super(date,price);
        this.name=name;

    }

    void setName(String name)
    {
        this.name=name;

    }

    @Override
    public void useTicket() {
        if (noofrideleft > 0) {
            noofrideleft--;
            System.out.println("Ticket used. Remaining rides: " + noofrideleft);
        } else {
            System.out.println("No rides left! Ticket expired.");
        }
    }

    @Override
   public int getRidesLeft()
    {
        return noofrideleft;
    }
}
