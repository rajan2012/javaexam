import com.sun.security.jgss.GSSUtil;

public class Stack {

    private int maxSize;
    private int[] stack;
    private int front;
    private int rear;
    private int nItems;

    /**
     * Der Konstruktor eines Stack-Objekt
     *
     * @param size Es wird eine Exception geworfen, falls der übergebene Wert kleiner als ein Basiswert ist.
     */
    Stack(int size){
        if (size < 1){
            throw new IllegalArgumentException("The capacity/size has to be at least 1! You entered: " + size);
        }
        this.maxSize = size;
        stack = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    /**
     * Die Methode erlaubt es, dass Elemente auf den Stack gelegt werden können.
     *
     * @param value Das Element, das hinzugefügt werden soll.
     */
    public void insert(int value){
        if (rear == maxSize-1) {
            setCapacity(maxSize * 2);
        }
        stack[++rear] = value;
        nItems++;
    }

    /**
     * vgl. insert(int value); Die Kapazität des Stacks spielt hierbei eine fundamentale Rolle
     *
     * @param valueToOffer Das Element, das angeboten/hinzugefügt werden soll.
     */
    public void offer(int valueToOffer){
        if (rear != maxSize-1) {
            insert(valueToOffer);
        }
        System.out.println("The queue's capacity is at its limit.");
    }

    public int remove(){
        if (isEmpty()) return -1;
        int valueToRemove = stack[rear--];
        nItems--;
        return valueToRemove;
    }

    /**
     * Die Methode lässt die Kapazität des Stacks anpassen.
     *
     * @param n Die Länge der neuen Kapazität des Stacks.
     */
    public void setCapacity(int n){
        int[] stack_old = stack;
        stack = new int[n];
        int i = 0;
        int j = front;
        if (!isEmpty()) {
            while (i != maxSize) {
                stack[j] = stack_old[i];
                i++; j++;
            }
        }
        front = 0;
        rear = j-1;
        maxSize = n;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }
    public boolean isEmpty() {
        return (nItems == 0);
    }
    public int size() {
        return maxSize;
    }

}

class MainKlasseStack {

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.insert(55);
        st.insert(60);
        st.insert(65);

    }
}
