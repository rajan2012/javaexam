// Generic Pair class
class Pair<T> {
    private T first;
    private T second;

    // Constructor
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // Get first element
    public T getFirst() {
        return first;
    }

    // Get second element
    public T getSecond() {
        return second;
    }
}

// Enum Days
enum Days {
    MONDAY(1, true),
    TUESDAY(2, true),
    WEDNESDAY(3, true),
    THURSDAY(4, true),
    FRIDAY(5, true),
    SATURDAY(6, false),
    SUNDAY(7, false);

    private final int dayNumber;
    private final boolean hasLecture;

    // Constructor
    Days(int dayNumber, boolean hasLecture) {
        this.dayNumber = dayNumber;
        this.hasLecture = hasLecture;
    }

    // Check if the day is lecture-free
    public boolean isLectureFree() {
        return !hasLecture;
    }

    // Get the day number
    public int dayNumber() {
        return dayNumber;
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Test Pair class
        Pair<Integer> pair = new Pair<>(10, 20);
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());

        // Test Enum Days
        for (Days day : Days.values()) {
            System.out.println(day + " - Day Number: " + day.dayNumber() +
                    ", Lecture Free: " + day.isLectureFree());
        }
    }
}
