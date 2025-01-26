public class Queue {

    public Queue() {}

    private Elem start, end;

    public void enQueue(Object newObj) {
        Elem newElem = new Elem(newObj);
        if (start == null)
            start = newElem;
        else
            end.setNext(newElem);
        end = newElem;
    }

    public Object deQueue() {
        if (start != null) {
            Elem temp = start;
            start = start.getNext();
            if (start == null)
                end = null;
            return temp.getObject();
        } else return null;
    }

    public boolean isEmpty() {
        return (start == null);
    }

    public boolean isFull() {
        return false;
    }

    public String toString() {
        Elem position = start;
        String str = "";
        while (position != null) {
            str += position.getObject().toString() + "  ";
            position = position.getNext();
        }
        return str;
    }

    // Method to calculate the size of the queue
    public int size() {
        int count = 0;
        Elem position = start;
        while (position != null) {
            count++;
            position = position.getNext();
        }
        return count;
    }

    // Method to append an array of integers to the queue
    public void append(int[] arr) {
        for (int num : arr) {
            enQueue(num);
        }
    }

    // Method to find an element at a specific index
    public Object elementAt(int index) {
        if (index < 0) return null;

        Elem position = start;
        int count = 0;
        while (position != null) {
            if (count == index) {
                return position.getObject();
            }
            count++;
            position = position.getNext();
        }
        return null; // Return null if index is out of bounds
    }

    // Method to check if the queue contains a specific element
    public boolean contains(Object obj) {
        Elem position = start;
        while (position != null) {
            if (position.getObject().equals(obj)) {
                return true;
            }
            position = position.getNext();
        }
        return false;
    }

    // Static method to concatenate two queues
    public static Queue concat(Queue q1, Queue q2) {
        Queue result = new Queue();

        // Add elements from the first queue
        Elem position = q1.start;
        while (position != null) {
            result.enQueue(position.getObject());
            position = position.getNext();
        }

        // Add elements from the second queue
        position = q2.start;
        while (position != null) {
            result.enQueue(position.getObject());
            position = position.getNext();
        }

        return result;
    }

    // Method to convert the queue to an array
    public int[] toArray() {
        int[] arr = new int[size()];
        Elem position = start;
        int index = 0;
        while (position != null) {
            arr[index++] = (Integer) position.getObject();
            position = position.getNext();
        }
        return arr;
    }
}
