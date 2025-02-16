import java.time.LocalDate;

// Derived Class: FourWayTicket (Implements Expirable)
class FourWayTicket extends BusTicket implements Expirable {
    private int tripsLeft;

    // Constructor
    public FourWayTicket(LocalDate purchaseDate, double ticketPrice) {
        super(purchaseDate, ticketPrice);
        this.tripsLeft = 4;
    }

    // Implementing useTicket() from Expirable Interface
    @Override
    public void useTicket() {
        if (tripsLeft > 0) {
            tripsLeft--;
            System.out.println("One ride used. Rides left: " + tripsLeft);
        } else {
            System.out.println("No rides left.");
        }
    }

    // Implementing getRideLeft() from Expirable Interface
    @Override
    public int getRideLeft() {
        return tripsLeft;
    }

    @Override
    public String toString() {
        return "FourWayTicket: " + super.toString() + ", Trips Left: " + tripsLeft;
    }
}