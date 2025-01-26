



class Node {
  int data;
  Node next;

  public Node(int data)
  {
      this.data=data;
      this.next=null;
  }
}

class LinkedListQueue {

   private Node front,rear;

    public LinkedListQueue() {
     front=rear=null;
    }

    int size=0;

    public int size() {
        Node temp=front;
        while(temp.next!=null)
        {
            size++;
            temp=temp.next;
        }
        return size;
    }

    public boolean isEmpty() {
       return (front==null);
    }

    public boolean isFull() {
        return (rear.==size()-1);
    }

    public void enqueue(int data) {
        Node n=new Node(data);
      if(isfull())
      {
          return;

      }
      else
      {
          rear.next=n;
          rear=n;

      }
    }

    {

    }

    public int dequeue() {

        if(isEmpty())
        {
            return ;
        }
        else
        {
            int data=front.data;
            front=front.next;
        }
    }

    public int peek() {

        System.out.println(front.data);
    }
}

public class test2 {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue is empty: " + queue.isEmpty());
    }
}


