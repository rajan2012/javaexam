import java.time.LocalDate;

class AnnualTicket extends BusTicket {
    private String buyerName;



    // Constructor
    public AnnualTicket(String buyerName, double ticketPrice, LocalDate purchaseDate) {
        super(purchaseDate, ticketPrice);
        this.buyerName = buyerName;
    }

    // Getter and Setter for Buyer Name
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    @Override
    public String toString() {
        return "AnnualTicket: " + "Name: " + buyerName + ", " + super.toString();
    }



}