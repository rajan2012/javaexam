package Inheritence;

public class TicketSystemTest {

    public static void main(String[] args) {
        BusTicket simpleTicket = new BusTicket("2024-02-03", 2.50);
        AnnualTicket annualTicket = new AnnualTicket("2024-02-03", 100.0, "Alice");


        FourWayTicket fourWayTicket = new FourWayTicket("2024-02-03", 10.0);

        System.out.println("Simple Ticket ID: " + simpleTicket.getId());
        System.out.println("Annual Ticket Holder: " + annualTicket.getName());

        System.out.println("Four Way Ticket Rides Left: " + fourWayTicket.getRidesLeft());
        fourWayTicket.useTicket();
        System.out.println("Four Way Ticket Rides Left after use: " + fourWayTicket.getRidesLeft());
    }

}
