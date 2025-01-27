public class chrcount {


    public static void main(String[] args){

        String main = "Jojjo".toLowerCase();
        char search = 'j';
        char[] jo = main.toCharArray();
        int count = 0;


        for(int i=0; i<jo.length;i++){

            if(jo[i] == search){
                count++;
            }
        }
           System.out.println(count);


    }
}
