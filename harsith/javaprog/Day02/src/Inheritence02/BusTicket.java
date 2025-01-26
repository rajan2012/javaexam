package Inheritence02;

public class BusTicket {
    private static int ID = 0;
    private int id;

   private String date;
   double price;

    public BusTicket(String date, double price) {
        this.id = ID++;
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
