public class pallindome {

    public static void main(String[] args){

        String str = "Madam";
        str = str.toLowerCase();

        int i ;
        int j ;

        for( i=0, j = str.length() - 1; i<j ; i++, j--){

            if(str.charAt(i) != str.charAt(j)) break;

        }
             System.out.println("pallindrome" + (i >= j));

        }

    }

