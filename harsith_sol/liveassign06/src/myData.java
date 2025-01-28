import java.util.ArrayList;
import java.util.List;

/*
public class myData implements myDataInterface {

    List<myData> md;

    public myData()
    {
       md=new ArrayList<>();

    }

    @Override
    public void  init(int[] array)
    {
        for(int i=0;i<array.length;i++) {
            md.add(new myData(array[i]));
        }

    }

    @Override
    public int at(int n)
    {
       return Integer.valueOf(md.get(n));
    }


}

 */
public class myData implements myDataInterface {
    private int[] data;  // Array to store the copied data

    List<Integer> md;
    // Constructor
    public myData() {
        this.data = new int[0];// Initialize with an empty array
    this.md=new ArrayList<>();
    }

    // Implement the init method to copy the data
    @Override
    public void init(int[] array) {
        // Create a new array with the same length as the input array
        this.data = new int[array.length];
        // Copy the data from the input array to the instance array
        System.arraycopy(array, 0, this.data, 0, array.length);

        for(int a:array)
        {
            md.add(a);
        }

        //System;
    }

    // Implement the at method to return the value at index n
    @Override
    public int at(int n) {
        // Ensure the index is valid
        if (n >= 0 && n < data.length) {
            return data[n];
        } else {
            // If the index is out of bounds, you can return a default value or throw an exception
            throw new IndexOutOfBoundsException("Index " + n + " is out of bounds.");
        }
    }
}
