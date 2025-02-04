import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        Person[] persons = new Person[size];

        for (int i = 0; i < size; i++) {
            String name = sc.nextLine();
            int age = Integer.parseInt(sc.nextLine());
            String address = sc.nextLine();

            try {
                persons[i] = new Person(name, age, address);
                System.out.println(persons[i]);
            } catch (AgeTooLowException | IllegalAddressException e) {
                System.out.println(e.getMessage());
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
            }
        }
    }

