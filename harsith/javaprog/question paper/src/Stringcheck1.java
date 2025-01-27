//to check repeated characters "ab" in word "abab" - only for 4 characters given.
//can be used if require half string as output (even character).


public class Stringcheck1 {

    public static String findString(String s){

        if(s.length()%2!=0){
            return null;
        }

        int mid = s.length()/2;
        String first = s.substring(0,mid);
        String second = s.substring(mid);

        if(first.equals(second)){
            return first;
        }
        else{
            return null;
        }
    }


    public static void main(String[] args){

        String s = "abab";
        String res = findString(s);

        System.out.println(res);





    }
}
