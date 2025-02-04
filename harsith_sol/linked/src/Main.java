public class Main {
    public static void main(String[] args) {

        Queue q = new Queue ();

        q.enQueue(11);
        q.enQueue(12);
        q.enQueue(13);
        q.enQueue(14);
        q.enQueue(15);


        System.out.println("Middle element: " + q.midelem());

        System.out.println("sum " + q.sum());

    }
}
