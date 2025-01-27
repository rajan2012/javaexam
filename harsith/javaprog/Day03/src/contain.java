public class contain {

    public static String three(String name){

        String[] parts = name.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i< parts.length;i++){

            if(parts[i].contains("@")){

                sb.append(parts[i] + " ");

            }

        }
        return sb.toString();
    }

    public static void main(String[] args){


        String name = "Hello, this is @name1 and @name2";
        System.out.println(three(name));

    }
}
