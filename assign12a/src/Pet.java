public abstract class Pet {
    public double weight;
    public String name;

    public Pet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void feed(double g) {
        this.weight += g;
    }

    public void dropWeight(double g) {
        this.weight -= g;
    }

    public abstract String toString();

    public abstract String makeNoise();

    public abstract int compareTo(Pet pet) throws NotComparableException;
}
