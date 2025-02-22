
public class Main {
    public static void main(String[] args) {
        // Create BusTicket
        BusTicket ticket1 = new BusTicket("2025-02-01", 25.0);
        System.out.println(ticket1);

        // Create AnnualTicket
        AnnualTicket annualTicket = new AnnualTicket("2025-01-01", 300.0, "John Doe");
        System.out.println(annualTicket);

        // Create FourWayTicket and use it
        FourWayTicket fourWayTicket = new FourWayTicket("2025-02-01", 40.0);
        System.out.println(fourWayTicket);

        System.out.println();

        fourWayTicket.useTicket(); // 3 rides left
        fourWayTicket.useTicket(); // 2 rides left
        fourWayTicket.useTicket(); // 1 ride left
        fourWayTicket.useTicket(); // 0 rides left
        fourWayTicket.useTicket(); // Ticket expired
    }
}