public class strings {

    public static void main(String[] args) {

        String main = "Jjjo".toLowerCase();
        String search = "j".toLowerCase();
        char[] ser = search.toCharArray();
        int count =0;
        for(int i=0;i<main.length();i++){

            if(main.charAt(i)==ser[0]){
                count++;
            }

        }
        System.out.println(count);
    }
}