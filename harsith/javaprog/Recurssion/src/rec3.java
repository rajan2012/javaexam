public class rec3 {


    public static String g(String s){

        if (s.isEmpty()){
            return "empty";
        }

        if(s.length()%2 != 0){

            return s;

        }

        int mid = s.length()/2;
        String s1 = s.substring(0,mid);
        String s2 = s.substring(mid);


        return g(s1) + "#" + g(s2);

    }


    public static void main(String[] args){


        String s = "abcd";

        System.out.println(g(s));


    }


}
