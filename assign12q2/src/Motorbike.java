class Motorbike extends Traffic implements Collectible, ProtectiveClothing {
    public Motorbike(String name, double drivenKilometers, int maxSpeed) {
        super(name, 2, drivenKilometers, maxSpeed); // Motorbikes always have 2 wheels
    }

    @Override
    boolean licenseNeeded() {
        return true;
    }

    @Override
    public boolean needsProtectiveClothing() {
        return true; // Motorcyclists must wear protective clothing
    }

    @Override
    public int calcValue() {
        return (int) (drivenKilometers * wheels);
    }

    @Override
    public String toString() {
        return "Motorbike: " + super.toString();
    }
}
