
    class Main{
    // Main method to test the queue
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(35);
        queue.enqueue(40);

        queue.display(); // Output: Queue: 10 20 30 40

        System.out.println("Element at position 2: " + queue.search(2)); // Output: 20

        queue.dequeue();
        queue.display(); // Output: Queue: 20 30 40

        System.out.println("Element at position 1: " + queue.search(1));

        queue.findeven();// Output: 20

        ArrayQueue queue2 = new ArrayQueue(5);

        queue2.reverse2(queue2);

        queue2.display();


    }


}
