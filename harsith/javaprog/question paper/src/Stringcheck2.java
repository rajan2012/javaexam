

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Stringcheck2 {
    // Don't change this method
    public static int countUniqueWords(String s1){
       String [] sar=s1.split("\\s+") ;

       int unique=0;

       for (int i=0;i< sar.length;i++){

           for (int j=0;j< sar.length;j++){
               if(sar[i].equalsIgnoreCase(sar[j]) && i!=j)
                   sar[j]="0";
               break;

           }
//
       }
       for (int i=0;i< sar.length;i++) {
        if (!(sar[i].equalsIgnoreCase("0"))) unique +=1;
       }
       return unique;

    }

    public static int countUniqueWordsSet(String s1){

        String [] sar = s1.split("\\s+");

        Set<String> ste = new HashSet<>();

        for(int i=0; i< sar.length; i++){

            ste.add(sar[i]);

        }


        return ste.size();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Sentence: ");
        String s = sc.nextLine();

        System.out.println("Word unique counter: " + countUniqueWordsSet(s));

    }
}

