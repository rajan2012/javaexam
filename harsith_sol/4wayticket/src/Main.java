import java.time.LocalDate;

// Main Class to test the functionality
public class Main {
    public static void main(String[] args) {




        // Creating AnnualTicket Object
        AnnualTicket annualTicket = new AnnualTicket("John Doe", 1200.00, LocalDate.of(2025, 2, 16));
        System.out.println(annualTicket);

        // Creating FourWayTicket Object
        FourWayTicket fourWayTicket = new FourWayTicket(LocalDate.of(2025, 2, 16), 10.00);
        System.out.println(fourWayTicket);

        // Using FourWayTicket
        fourWayTicket.useTicket();
        fourWayTicket.useTicket();
        fourWayTicket.useTicket();
        fourWayTicket.useTicket();
        fourWayTicket.useTicket();  // This should show no rides left

        // Check Rides Left
        System.out.println("Rides left: " + fourWayTicket.getRideLeft());
    }
}