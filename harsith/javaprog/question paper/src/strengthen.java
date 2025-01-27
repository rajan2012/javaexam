public class strengthen {


    public static String three(String name) {


        String[] words = name.split("\\s+");
        StringBuilder res = new StringBuilder();


        for (int i = 0; i < words.length; i++) {

            if (words[i].contains("@")) {

                res.append(words[i]).append(" ");

            }

        }
        return res.toString().trim();
    }



    public static void main(String[] args){


        String name = "Hello, this is @name1 and @name2";
        System.out.println(three(name));

    }


}
