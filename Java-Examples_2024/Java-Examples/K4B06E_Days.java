public class K4B06E_Days {
   public static void main (String[] args) {

//declaration and initialization of an array of dimension 1
//name: week,  
//type of elements: String
//number of elements: 7
      String [] week = { "Monday", "Tuesday", "Wednesday", 
                          "Thursday", "Friday", 
                          "Saturday", "Sunday"};

// the indexes of the array elements run from 0 to 6
// (from 0 to week.length-1)

      System.out.println( "Days of the week:" );
      for (int i = 0; i < week.length; i++)  
         System.out.println(" week [" + i + "] = " + week [i]);  
// week [i]:  access the ith array element

   }
}
