

class ArrayQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor to initialize queue
    public ArrayQueue(int capacity) {

        this.front=0;
         this.rear=-1;
        this.size=0;
        this.capacity=capacity;
        queue=new int[capacity];
    }

    // Enqueue operation (Add element)
    public void enqueue(int item) {
        
        if(size==capacity)
        {
            //full;
            //throw some expcepti
        }
        rear=(rear+1)%capacity;
        queue[rear]=item;
        size++;
        
    }

    // Dequeue operation (Remove element)
    public int dequeue() {
        if(size==0)
        {
            //empty throw
        }
        int data=queue[front];
        front=(front+1)%capacity;
        size--;
        return data;

    }

    // Check if queue is empty
    public boolean isEmpty() {

        return size==0;
    }

    // Search for element at a specific position (1-based index)
    public int search(int position) {

        return queue[(front+position-1)%capacity];
    }

    // Display queue
    public void display() {

        for(int i=0;i<size;i++)
        {
            System.out.println(queue[(front+i)%capacity]);
        }
    }

    public void findeven() {
        System.out.println("size is "+size);
        for(int i=0;i<size;i++)
        {
            if(queue[(front+i)%capacity]%2==0)
            {
                System.out.println("even number "+queue[(front+i)%capacity]);
            }
        }
    }

    public int[] reverse()
    {
        int[] reverse =new int[size];
        for(int i=0;i<size;i++)
        {
            reverse[(front+i)%capacity]=queue[(rear-i)%capacity];
        }

        return reverse;
    }

    public  ArrayQueue reverse2(ArrayQueue queue2) {
        int[] reverse = new int[size];
        for (int i = 0; i < size; i++) {
            queue2.enqueue(queue[(rear - i) % capacity]);

            // reverse[(front+i)%capacity]=queue[(rear-i)%capacity];
        }

        return queue2;
    }

}