public class main3 {

    public static String encrypt(String msg, int shift){

        char[] chword = msg.toCharArray();
        String res = " ";

        for(int i=0;i< chword.length;i++){

            res += (char)(chword[i]+shift);
        }
       return res;
    }


    public static void main(String[] args) {
        String originalMessage = "Hello,world";
        int shift = 2;

        String encryptedMessage = encrypt(originalMessage, shift);
        System.out.println("Original: " + originalMessage);
        System.out.println("Encrypted: " + encryptedMessage);
    }
}
