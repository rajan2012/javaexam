// str1 = "abc" and str2 = "123", the result should be "a1b2c3".

public class jump {

    public static String interleaveStrings(String str1, String str2){

        if(str1.length() != str2.length()){
            return null;
        }


        char[] chstr1 = str1.toCharArray();
        char[] chstr2 = str2.toCharArray();

        StringBuilder sb = new StringBuilder();

        String res = "";

        for(int i=0;i< chstr1.length;i++){

            res = res + chstr1[i] + chstr2[i];
            sb.append(str1.charAt(i)).append(str2.charAt(i)); //that or this anything is fine;

        }
        return res.toString() + " " + sb;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "123";

        String interleavedString = interleaveStrings(str1, str2);
        System.out.println(interleavedString); // Expected output: "a1b2c3"
    }
}
