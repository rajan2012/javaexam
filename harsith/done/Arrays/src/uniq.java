import java.util.Scanner;

public class uniq {

    static int countUniqueWords(String s){

       String[] unq = s.toLowerCase().split("\\s+");
        int unqcount = 0;

       for(int i=0; i<unq.length;i++){
         boolean isuniq = true;
           for(int j=0;j<i;j++){

               if(unq[i].equals(unq[j])){
                   isuniq = false;
               }

           }
           if (isuniq) {
               unqcount++;
           }
       }

        return unqcount;

    }

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Sentence: ");
        String s = sc.nextLine();

        System.out.println("Word unique counter: " + countUniqueWords(s));

    }
}
