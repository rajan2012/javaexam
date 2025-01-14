abstract class Traffic {
    protected String name;
    protected int wheels;
    protected double drivenKilometers;
    protected int maxSpeed;

    public Traffic(String name, int wheels, double drivenKilometers, int maxSpeed) {
        this.name = name;
        this.wheels = wheels;
        this.drivenKilometers = drivenKilometers;
        this.maxSpeed = maxSpeed;
    }

    abstract boolean licenseNeeded();

    public void addKilometer(int km) {
        this.drivenKilometers += km;
    }

    @Override
    public String toString() {
        return name + ", " + drivenKilometers + " km, " + maxSpeed + " km/h, " + wheels + " wheels";
    }
}
