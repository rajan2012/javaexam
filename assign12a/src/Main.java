public class Main {
    public static void main(String[] args) {
        try {
            Cat cat = new Cat("Garfield", 4.2);
            Dog dog1 = new Dog("Lucky", 9.8);
            Dog dog2 = new Dog("Rex", 16.0);

            System.out.println(cat.toString());
            System.out.println(cat.makeNoise());

            System.out.println(dog1.toString());
            System.out.println(dog1.makeNoise());

            dog1.walkTheDog();

            // Attempt to walk a dog that's too heavy
            try {
                dog2.walkTheDog();
            } catch (TooHeavyException e) {
                System.out.println(e.getErrMsg());
            }

            // Compare two pets
            try {
                System.out.println(cat.compareTo(dog1));
            } catch (NotComparableException e) {
                System.out.println(e.getErrMsg());
            }

            // Compare two dogs
            try {
                System.out.println(dog1.compareTo(dog2));
            } catch (NotComparableException e) {
                System.out.println(e.getErrMsg());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
