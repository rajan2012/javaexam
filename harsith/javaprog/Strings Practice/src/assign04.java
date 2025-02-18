public class assign04 {


    static String encrypt(String msg, int shift){
        StringBuilder sb = new StringBuilder();



        char[] ch  = msg.toCharArray();

        for(int i=0; i< ch.length;i++){

            char shiftchr = (char) (ch[i] + shift );

            sb.append(String.valueOf(shiftchr));

        }

return sb.toString();
    }

    public static void main(String[] args) {
        String message = "Hallo";
        int shift = 5;
        String encryptedMessage = encrypt(message, shift);
        System.out.println("Encrypted Message: " + encryptedMessage); // Should output: Mfqqt
    }
}
