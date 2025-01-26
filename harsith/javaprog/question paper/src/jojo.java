public class jojo {


    public static void main(String[] args) throws Exception{

        String main = "Jojo";
        String search = "j";

        main = main.toLowerCase();
        search = search.toLowerCase();

        int count=0;

        try {

            for (int i = 0; i < main.length() ; i++) {


                if (main.substring(i, i + search.length()).equals(search)) {

                    count++;
                }

            }
            System.out.println(count);

        }
        catch (Exception e){
            throw new Exception("exception caught");
        }
    }

}
