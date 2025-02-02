import java.util.List;

public class main2 {

    public static void main(String[] args) {
        Person user1 = new Person("Alice");
        Person user2 = new Person("Bob");

        System.out.println(user1.id);
        System.out.println(user2.id);

        NumberList numList = new NumberList();
        numList.addNumber(5);
        numList.addNumber(10);
        numList.addNumber(-3); // This will cause an exception

        Calculator calculator = new Calculator();

        List<Integer> list = numList.getNumbers();

        // Convert List<Integer> to int[]
        int[] arr = list.stream().mapToInt(i -> i).toArray();

        try {
            int result = calculator.sum(arr);
            System.out.println("Sum of numbers: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
