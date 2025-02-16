import java.time.LocalDate;

// Base Class: BusTicket
class BusTicket {
    private static int idCounter = 0;
    private int id;
    private LocalDate purchaseDate;
    private double ticketPrice;

    // Constructor
    public BusTicket(LocalDate purchaseDate, double ticketPrice) {
        this.id = ++idCounter;
        this.purchaseDate = purchaseDate;
        this.ticketPrice = ticketPrice;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id + ", Date: " + purchaseDate + ", Price: " + ticketPrice;
    }
}