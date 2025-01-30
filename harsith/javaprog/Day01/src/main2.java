import java.util.Scanner;

public class main2 {

    public static int overlap(String str1, String str2){

        int count =0;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

       String[] s1 = str1.split("\\s+");
       String[] s2 = str2.split("\\s+");


       for(int i=0;i<s1.length;i++){

           for(int j=0;j<s2.length;j++){

               if(s1[i].equals(s2[j])){

                   count++;
               }
           }
       }
return count;
    }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("str1: ");
            String str1 = sc.nextLine();
            System.out.print("str2: ");
            String str2 = sc.nextLine();

            int overlap = overlap(str1, str2);
            System.out.print("Overlap: " + overlap);
        }


    }      // Your code


