class Car extends Traffic implements Collectible, ProtectiveClothing {

    public Car(String name, double drivenKilometers, int maxSpeed) {
        super(name, 4, drivenKilometers, maxSpeed); // Cars always have 4 wheels
    }

    @Override
    boolean licenseNeeded() {
        return true;
    }

    @Override
    public boolean needsProtectiveClothing() {
        return false; // Cars don't require protective clothing
    }

    @Override
    public int calcValue() {
        return (int) (drivenKilometers * wheels);
    }

    @Override
    public String toString() {
        return "Car: " + super.toString();
    }
}
