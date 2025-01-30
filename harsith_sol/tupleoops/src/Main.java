public class Main {
    public static void main(String[] args) {
        Tuple<String, Integer> tuple1 = new Tuple<>("Alice", 25);
        Tuple<Double, String> tuple2 = new Tuple<>(99.9, "Temperature");

        System.out.println(tuple1); // Tuple ID: 0 | Left: Alice | Right: 25
        System.out.println(tuple2); // Tuple ID: 1 | Left: 99.9 | Right: Temperature
    }
}
