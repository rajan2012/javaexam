public class Cat extends Pet {

    public Cat(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String toString() {
        return "Cat: " + name + " weighs " + weight + " kg";
    }

    @Override
    public String makeNoise() {
        return "Meow";
    }

    @Override
    public int compareTo(Pet pet) throws NotComparableException {
        if (!(pet instanceof Cat)) {
            throw new NotComparableException(this);
        }
        return Double.compare(this.weight, pet.weight);
    }
}
