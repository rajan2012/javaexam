public class phrasepalin {


    public static boolean reversem(String s1,int index) {
        // Base case: if index is out of bounds for either string, return an empty string

        if (index == s1.length()/2) {
            return true;
        }

        // If characters match at the current index, proceed to the next character
        if(s1.charAt(index)==s1.charAt(s1.length()-(index+1))) {
            return reversem(s1, index + 1);
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args)
    {
        String s="Madam in Eden I’m Adam";

        boolean s1=reversem(s.replace(" ","").toLowerCase().replace("’",""),0);



        System.out.println(s1);

        System.out.println(s.replace(" ","").toLowerCase().replace("’",""));



    }
}
