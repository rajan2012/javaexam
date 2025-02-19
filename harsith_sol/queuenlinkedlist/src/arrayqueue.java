class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListQueue {
    private Node front, rear;
    private int size; // To keep track of the size of the queue

    public LinkedListQueue() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) { // If queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++; // Increment the size
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int data = front.data;
        front = front.next;

        if (front == null) { // If queue becomes empty
            rear = null;
        }
        size--; // Decrement the size
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }

    public int getSize() {
        return size; // Return the current size
    }
}

public class LinkedListQueueDemo {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Size of the queue: " + queue.getSize()); // Output: 3

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Size of the queue: " + queue.getSize()); // Output: 2

        queue.enqueue(40);
        System.out.println("Size of the queue: " + queue.getSize()); // Output: 3
    }
}
