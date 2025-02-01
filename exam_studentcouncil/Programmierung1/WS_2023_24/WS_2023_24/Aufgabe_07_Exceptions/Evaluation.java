import java.util.*;
public class Evaluation {

    public static void main(String[] args) {
        System.out.println( Checker.exceptionCheck() );
    }
    
    public static void exceptionTrigger(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        switch (n){
            case 1: {n = 1/0;}
            case 2: {n = Integer.parseInt("dummy");}
            case 3: {int[] a = new int[-1];}
            case 4: {int[] a = new int[10]; n= a[42];}
            case 5: {int[] a = null; n= a[42];}
        }
    }
    

}
