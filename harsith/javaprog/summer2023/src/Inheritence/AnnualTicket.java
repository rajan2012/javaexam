package Inheritence;

public class AnnualTicket extends BusTicket{

    private String name;

    public AnnualTicket(String date, double price, String name) {
        super(date, price);
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
