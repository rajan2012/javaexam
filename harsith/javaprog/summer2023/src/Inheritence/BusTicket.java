package Inheritence;

public class BusTicket {
    private static int id =0;
  private  int newid = 0;
  private String date;
  private double price;

    public BusTicket( String date, double price) {
        this.newid = id++;
        this.date = date;
        this.price = price;
    }

    public static int getId() {
        return id;
    }

    public int getNewid() {
        return newid;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }
}


