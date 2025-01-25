

import java.util.Random;
import java.util.Scanner;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class revernum {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a=0;

        int m=n;

        int quotient=0;

        int remainder=0;

        int count=0;

        //count number of digits in 10,100 excluding digit as unit place
        while(n/10>0) {
            count++;
            n=n/10;
        }

        System.out.println(count);

        //for uncluding unit digit too
       // count++;

        int divisor=0;
        while(m/10!=0) {
            quotient = Integer.valueOf(m / 10);

           // System.out.println("quotient is "+quotient);

            remainder = m % 10;

           // System.out.println("remainder is "+remainder);

            a+= (int) (remainder*Math.pow(10,count--));

           // System.out.println("number is "+a);


            m=m/10;

        }

        a+=quotient;


        System.out.println(a);

    }

    
}

