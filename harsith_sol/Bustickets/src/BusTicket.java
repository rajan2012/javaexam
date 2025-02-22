import java.util.HashMap;
import java.util.Objects;

public class BusTicket {

    String date;
    double price;

    static int counter=1;
    int id;

    public BusTicket(String date, double price)
    {
       this.date=date;
       this.price=price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCounter() {
        return counter;
    }




    public static void setCounter(int counter) {
        BusTicket.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
