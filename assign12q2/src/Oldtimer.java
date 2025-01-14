class Oldtimer extends Car {
    private int year;

    public Oldtimer(String name, double drivenKilometers, int maxSpeed, int year) {
        super(name, drivenKilometers, maxSpeed);
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + " "+year;
    }
}
