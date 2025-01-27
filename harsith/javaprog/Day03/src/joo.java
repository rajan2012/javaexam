public class joo {

    public static void main (String[]args){

    String main = "Jojo".toLowerCase();
    String  search = "j".toLowerCase();
     int count =0;


        for(int i=0; i<main.length();i++) {

            if (main.startsWith(search, i)) {

                count++;
            }

        }
        System.out.println(count);
    }

}
