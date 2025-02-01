public class Queue {

    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    /**
     * Der Konstruktor eines Queue-Objekt
     *
     * @param size Es wird eine Exception geworfen, falls der übergebene Wert kleiner als ein Basiswert ist.
     */
    Queue(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("The capacity/size has to be at least 1! You entered: " + size);
        }
        this.maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    /**
     * Die Methode erlaubt es, dass Elemente in die Queue hinzugefügt werden können.
     *
     * @param value Das Element, das hinzugefügt werden soll.
     */
    public void insert(int value){
        if (rear == maxSize-1) {
            setCapacity(maxSize * 2);
        }
        queueArray[++rear] = value;
        nItems++;
    }

    /**
     * vgl. insert(int value); Die Kapazität der Queue spielt hierbei eine fundamentale Rolle
     *
     * @param valueToOffer Das Element, das angeboten/hinzugefügt werden soll.
     */
    public void offer(int valueToOffer){
        if (rear != maxSize-1) {
            insert(valueToOffer);
        }
        System.out.println("The queue's capacity is at its limit.");
    }

    /**
     * Die Methode gibt das nächste Element in der Queue aus.
     *
     * @return valueToRemove Das Element, das ausgegeben werden soll.
     */
    public int remove(){
        if (isEmpty()) return -1;
        int valueToRemove = queueArray[front++];
        nItems--;
        return valueToRemove;
    }

    /**
     * Die Methode lässt die Kapazität der Queue anpassen.
     *
     * @param n Die Länge der neuen Kapazität der Queue.
     */
    public void setCapacity(int n){
        int[] queue_old = queueArray;
        queueArray = new int[n];
        int i = 0;
        int j = front;
        if (!isEmpty()) {
            while (i != maxSize) {
                queueArray[j] = queue_old[i];
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
    public int peekFirst(){
        return queueArray[front];
    }
    public int peekLast(){
        return queueArray[rear];
    }


}

class MainKlasseQueue {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(55);
        queue.insert(60);
        queue.insert(65);
    }

}
