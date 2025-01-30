public class Tuple<T, U> {
    private static int idCounter = 0;  // Auto-incrementing ID
    private int id;
    private T left;
    private U right;

    // Constructor to initialize left and right values and assign a unique ID
    public Tuple(T left, U right) {
        this.id = idCounter++;
        this.left = left;
        this.right = right;
    }

    // Getters
    public int getId() {
        return id;
    }

    public T getLeft() {
        return left;
    }

    public U getRight() {
        return right;
    }

    // Setters
    public void setLeft(T left) {
        this.left = left;
    }

    public void setRight(U right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Tuple ID: " + id + " | Left: " + left + " | Right: " + right;
    }
}
