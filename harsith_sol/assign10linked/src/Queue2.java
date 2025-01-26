import java.util.ArrayList;
import java.util.List;

public class Queue2 {

    public Queue2() {}

    private Elem start, end;
    int size;

    public void enQueue (Object newObj) {
        Elem newElem = new Elem(newObj);
        if (start == null)
            start = newElem;
        else
            end.setNext(newElem);
        end = newElem;
    }

    public void append (int[] a) {

        for(int i=0;i<a.length;i++)
        {
            Elem e=new Elem(a[i]);
            end.setNext(e);

        }

    }

    public Object elementAt(int a) {
        Elem temp1 = start;
        int count=0;

        Object ob=null;

        while(temp1.getNext()!=null)
        {
            if(count==a)
            {
                ob= temp1.getObject();
            }
            count++;
        }
        return ob;
    }

    public boolean contains(int a) {
        Elem temp1 = start;
        int count = 0;
        boolean flag=false;
        while(temp1.getNext()!=null)
        {
            if(temp1.getObject()==(Object)a)
            {
                flag=true;
            }
        }
        return flag;

    }

        public Object deQueue () {
        if (start != null) {
            Elem temp = start;
            start = start.getNext();
            if (start == null)
                end = null;
            return temp.getObject();
        }
        else return null;
    }

    public boolean isEmpty () {
        return (start == null);
    }

    public boolean isFull () {
        return false;
    }

    public int size()
    {
        if (start != null) {
            Elem temp = start;
            while(temp.getNext()!=null)
            {
                size++;
                Elem e=(Elem)temp.getObject();
                temp.setNext(e);
            }
            return size;
        }
        else return 0;
    }

   public int[] toArray()
   {
       Elem temp = start;

       List<Integer> l=new ArrayList<>();
       while(temp.getNext()!=null)
       {
           l.add((Integer)temp.getObject());
       }

       int[] intArray = new int[l.size()];
       for (int i = 0; i < l.size(); i++) {
           intArray[i] = l.get(i); // Unboxing from Integer to int
       }

       return intArray;

   }

    public String toString () {
        Elem position = start;
        String str = "";
        while (position != null) {
            str += position.getObject()
                    .toString() + "  ";
            position = position.getNext();
        }
        return str;
    }

    /* Your solution starts here */


}
