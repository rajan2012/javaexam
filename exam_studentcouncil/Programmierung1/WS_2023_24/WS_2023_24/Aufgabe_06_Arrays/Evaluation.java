import java.util.*;
public class Evaluation {
    
    public static void printArray(int[] array){
         if (array != null) {
            for (int i=0; i< array.length; i++)
                System.out.print(" "+array[i]);
            System.out.println (" length: "+ array.length);
        } else {
            System.out.println(" null");
        }    
    }

    public static void main ( String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int test = sc.nextInt();
        int [] data = null; 
        if (test >= 0 ){
            data = new int[test];
            for (int i=0; i< test; i++){
                data[i]=sc.nextInt();
            }
        }
       
        int[] result = A6.mirrorArray(data);

        System.out.print("data:");
        printArray(data);

        System.out.print("result:");
        printArray(result);
    }
}
