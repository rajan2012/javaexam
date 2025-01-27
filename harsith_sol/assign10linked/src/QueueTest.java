public class QueueTest {
    public static void main(String[] args) {

        Queue2 q = new Queue2();

        q.enQueue(11);
        System.out.println( q + "# size: " + q.size() );

        int[] f = { 22, 33, 44, 55, 66 };
        q.append( f );
        System.out.println( q + "# size: " + q.size() );

        System.out.println( (Integer) q.deQueue() );
        System.out.println( q + "# size: " + q.size() );
        System.out.println( q.isEmpty() + " " + q.isFull() );

        System.out.println( q.elementAt(2) );

        System.out.println( q.contains(33) );

        System.out.println( q.contains(77) );

        Queue2 p = new Queue2();
        int[] g = { 77, 88, 99 };
        p.append( g );

        //Queue r = Queue.concat(q,p);
        Queue2 r = p;
        System.out.println( r + "# size: " + r.size() );
        System.out.println( q + "# size: " + q.size() );
        System.out.println( p + "# size: " + p.size() );

        f = p.toArray();
        for (int i=0; i< f.length; i++) System.out.print( f[i] + "  ");
        System.out.println();

        System.out.println( r.toString() + "# size: " + r.size() );
        System.out.println( r.isEmpty() + " " + r.isFull() );

    }
}
