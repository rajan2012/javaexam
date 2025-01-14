class Bicycle extends Traffic implements ProtectiveClothing {
    private boolean carrier;

    public Bicycle(String name, double drivenKilometers, boolean carrier) {
        super(name, 2, drivenKilometers, 30); // Bicycle always has 2 wheels and max speed of 30 km/h
        this.carrier = carrier;
    }

    @Override
    boolean licenseNeeded() {
        return false;
    }

    @Override
    public boolean needsProtectiveClothing() {
        return true; // Cyclists should wear protective clothing
    }

    @Override
    public String toString() {
        return "Bicycle: " + super.toString();
    }
}
