package Inheritence02;

public class Evaluation {

    public static void main(String[] args) {
        // Create an instance of AnnualTicket
        AnnualTicket annualTicket = new AnnualTicket("2024-02-21", 120.00, "John Doe");
        System.out.println("Annual Ticket:");
        System.out.println("Ticket ID: " + annualTicket.getId());
        System.out.println("Purchase Date: " + annualTicket.getDate());
        System.out.println("Price: " + annualTicket.getPrice());
        System.out.println("Ticket Holder: " + annualTicket.getName());

        // Create an instance of FourWayTicket
        FourWayTicket fourWayTicket = new FourWayTicket("2024-02-21", 30.00);
        System.out.println("\nFour Way Ticket:");
        System.out.println("Ticket ID: " + fourWayTicket.getId());
        System.out.println("Purchase Date: " + fourWayTicket.getDate());
        System.out.println("Price: " + fourWayTicket.getPrice());
        System.out.println("Trips Remaining Before: " + fourWayTicket.getRidesLeft());

        // Simulate using the FourWayTicket
        fourWayTicket.useTicket();
        System.out.println("Trips Remaining After One Use: " + fourWayTicket.getRidesLeft());

        // Check if tickets can be used up
        System.out.println("Using remaining trips...");
        while (fourWayTicket.getRidesLeft() > 0) {
            fourWayTicket.useTicket();
        }
        System.out.println("Trips Remaining After All Uses: " + fourWayTicket.getRidesLeft());
    }
}
