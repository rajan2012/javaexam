import java.util.Random;

public class main9 {

    public static boolean isValid(String password){

        char[] pass = password.toCharArray();

        boolean hasDigit = false;
        boolean hasAlpha = false;
        boolean hasSpecial = false;

        if(pass.length<10){
            return false;
        }


        for(int i=0;i<pass.length;i++){

            if(Character.isDigit(password.charAt(i))){
                hasDigit = true;
            }

           else if(Character.isAlphabetic(pass[i])){
               hasAlpha = true;
            }
           else {
               hasSpecial = true;
            }

        }

return hasDigit && hasAlpha && hasSpecial;
    }


    public static void main(String[] args) {
        // Example passwords for testing
        String[] passwords = {"1234567890$a", "abcdefghij", "abc123", "abc123$", "a1$", "12345a!A0U"};
        for (String password : passwords) {
            System.out.println("Password: " + password + " is valid: " + isValid(password));
        }
    }
}
