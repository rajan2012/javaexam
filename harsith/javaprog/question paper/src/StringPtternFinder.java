public class  StringPtternFinder{

    public static String findT(String s1, String s2){


        if(!s1.contains(s2)){

            return null;

        }

        int index = s1.indexOf(s2);

        String t = s1.substring(0,index);

        String s1new = t + s2 +t  ;

        if(s1.equalsIgnoreCase(s1new)){

            return t;

        }

        else return null;

    }




    public static void main(String[] args){

        System.out.println(findT("AutoBuchAuto", "Buch")); // Expected: Auto
        System.out.println(findT("xxyxxxExamplexxyxxx", "Example")); // Expected output needs correction based on your example
        System.out.println(findT("aaabbb", "Apfel")); // Expected: null




    }


}