package Inheritence;

public class BusTicket {
    private static int nextId = 0;
    private final int id;
    private final String date;
    private final double price;

    public BusTicket(String date, double price) {
        this.id = nextId++;
        this.date = date;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

}


