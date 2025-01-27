public class strings1 {

    public static String three(String name){

        String[] res = name.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<res.length;i++){

            if(res[i].contains("@")){

                sb.append(res[i]);

            }

        }
          return sb.toString();

    }


    public static void main(String[] args){


        String name = "Hello, this is @name1 and @name2";
        System.out.println(three(name));

    }
}