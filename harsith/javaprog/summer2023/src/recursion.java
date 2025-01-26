public class recursion {


    public static int countStr( String str, String substr){
        str = str.toLowerCase();
        substr = substr.toLowerCase();

       if( str.length()<substr.length()){
           return 0;
       }

       if(str.startsWith(substr)){

           return 1 + countStr(str.substring(1), substr);
       }
       else {
           return countStr(str.substring(1), substr);
       }

    }






    public static void main(String[] args){


        String str = "abbbba";
        String Target = "bb";

        int count = countStr(str, Target); // Pass the target as an argument
        System.out.println("\"" + Target + "\" occurs " + count + " times in \"" + str + "\"");




    }
}
