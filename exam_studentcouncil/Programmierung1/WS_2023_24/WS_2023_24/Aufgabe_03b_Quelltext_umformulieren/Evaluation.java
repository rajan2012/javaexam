import java.util.Scanner;

public class Evaluation {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        int [] data = null; 
        if (test >= 0 ){
            data = new int[test];
            for (int i=0; i< test; i++){
                data[i]=sc.nextInt();
            }
        }
        int value = sc.nextInt();

        System.out.print("Original result ");
        try {
            int result = A3a.f(data, value);
            System.out.print(result);
        }
        catch(Exception e){  
            System.out.print("Exception");
        }
        System.out.println();
        
        System.out.print("Student's result ");
        try {
            int result = A3b.g(data, value);
            System.out.print(result);
        }
        catch(Exception e){  
            System.out.print("Exception");
        }
        System.out.println();
        
   }
}