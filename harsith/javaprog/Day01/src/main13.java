import java.util.Scanner;

public class main13 {

    static int countUniqueWords(String s){

        String[] uni = s.toLowerCase().split("\\s+");
        int uniqcount=0;
        for(int i=0; i<uni.length;i++){
            boolean isuniq =true;
            for(int j=0; j<i;j++) {

                if (uni[i].equals(uni[j])) {
                    isuniq = false;
                    break;
                }
            }
                if(isuniq){
                    uniqcount++;
                }

            }
        return uniqcount;
        }



    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Sentence: ");
        String s = sc.nextLine();

        System.out.println("Word unique counter: " + countUniqueWords(s));

    }
}
