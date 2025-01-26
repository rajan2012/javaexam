package Inheritence;

public class AnnualTicket extends BusTicket{

    private final String name;

    public AnnualTicket(String date, double price, String name) {
        super(date, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    }

