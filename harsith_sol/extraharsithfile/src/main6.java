


public class main6 {

    public static int countStr( String str, String Target){

        str = str.toLowerCase();
        Target = Target.toLowerCase();


        if(str.length() < Target.length()){

            return 0;

        }

        if(str.startsWith(Target)){


            return 1 + countStr(str.substring(Target.length()-1), Target);

        }
        return countStr(str.substring(1), Target);


    }


    public static void main(String[] args){


        String str = "Catcatcatdogcatdogcat";
        String Target = "cat";

        int count = countStr(str, Target); // Pass the target as an argument
        System.out.println("\"" + Target + "\" occurs " + count + " times in \"" + str + "\"");




    }

}

