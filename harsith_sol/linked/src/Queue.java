


public class Queue {

    public Queue ()  {}

    private Elem start, ende;

    public void enQueue (Object newObj) {
        Elem newElem = new Elem(newObj);
        if (start == null)
            start = newElem;
        else
            ende.setNext (newElem);
        ende = newElem;
    }

    public Object deQueue () {
        if (start != null) {
            Elem temp = start;
            start = start.getNext();
            if (start == null)
                ende = null;
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

    public int size()
    {
      if(isEmpty())
      {
          throw new IllegalStateException("queue is empty");
      }

      int size=0;
      Elem temp=start;
      while(temp!=null)
      {
          size++;
          temp=temp.getNext();
      }

      System.out.println(size);

      return size;

    }


    public int midelem()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("queue is empty");
        }

        int size=size();

        int startpoint=0;

        int mid=0;
        Elem temp=start;
        while(temp!=null)
        {
            if(startpoint==size/2)
            {
                 mid= (int)temp.getObject();
            }
            startpoint++;
            temp=temp.getNext();
        }

        return mid;

    }

    //reverse queue
    public int sum()
    {

      int sum=0;

        Elem temp=start;
        while(temp!=null)
        {
            sum+=(int)temp.getObject();

            temp=temp.getNext();
        }

        return sum;

    }

    public void append(int[] newData) {
        for (int num : newData) {
            enQueue(num);
        }
    }


}

