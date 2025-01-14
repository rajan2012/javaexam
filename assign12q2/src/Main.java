public class Main {
    public static void main(String[] args) {
        Traffic bicycle = new Bicycle("Roadster", 150.0, true);
        Traffic motorbike = new Motorbike("Harley", 3000.0, 150);
        Traffic car = new Car("Tesla", 5000.0, 200);
        Traffic oldtimer = new Oldtimer("Vintage Beetle", 10000.0, 120, 1970);

        // Print details
        System.out.println(bicycle);
        System.out.println(motorbike);
        System.out.println(car);
        System.out.println(oldtimer);

        // Check license requirement
        System.out.println("Bicycle license needed: " + bicycle.licenseNeeded());
        System.out.println("Motorbike license needed: " + motorbike.licenseNeeded());

        // Add kilometers
        car.addKilometer(100);
        System.out.println(car);

        // Calculate collectible value
        System.out.println("Motorbike value: " + ((Motorbike) motorbike).calcValue());
        System.out.println("Car value: " + ((Car) car).calcValue());
    }
}
