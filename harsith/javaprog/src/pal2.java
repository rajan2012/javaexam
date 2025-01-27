public class pal2 {

    public static void main(String[] args){

        String str = "Madam";
        str = str.toLowerCase();
        boolean pal = true;


        int length = str.length();

        for (int i=0; i<length/2; i++){

            if(str.charAt(i) != str.charAt(length - i - 1)){
                pal = false;
                break;

            }
        }
        if (pal) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        }



    }

