public class assig01 {

    static boolean charTwice(String s){

        char[] ch = s.toCharArray();

        for(int i=0; i<ch.length;i++){
            int count=0;
            for(int j=0; j<ch.length;j++){

                if(ch[i] == ch[j]){
                    count++;
                }

            }
            if(count ==2){
                return true;
            }
        }
           return false;
    }

    public static void main(String[] args) {
        // Positive tests
        System.out.println(charTwice("Hello")); // true
        System.out.println(charTwice("Yahoo")); // true
        System.out.println(charTwice("Trier")); // true

        // Negative tests
        System.out.println(charTwice("Test")); // false
        System.out.println(charTwice("abc")); // false
        System.out.println(charTwice("HalLo")); // false
        System.out.println(charTwice("lalelu")); // false
    }

}
