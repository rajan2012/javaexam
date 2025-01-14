public class Dog extends Pet {

    public Dog(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String toString() {
        return "Dog: " + name + " weighs " + weight + " kg";
    }

    @Override
    public String makeNoise() {
        return "Woof";
    }

    public void walkTheDog() throws TooHeavyException {
        if (this.weight > 15.0) {
            throw new TooHeavyException(this.weight);
        }
        this.weight -= 0.2;
        System.out.println("! " + name + " goes for a walk and loses weight!");
    }

    @Override
    public int compareTo(Pet pet) throws NotComparableException {
        if (!(pet instanceof Dog)) {
            throw new NotComparableException(this);
        }
        return Double.compare(this.weight, pet.weight);
    }
}
