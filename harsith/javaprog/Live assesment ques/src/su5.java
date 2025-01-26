public class su5 {
    public static String secToString(int k){

        if(k<0 || k>= 86400){
            return null;
        }

        int hours = k / 3600;
        int minutes = (k % 3600) / 60;
        int seconds = k % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }


    public static void main(String[] args) {
        // Test cases
        System.out.println(secToString(121));        // Should return "00:02:01"
        System.out.println(secToString(86399));      // Should return "23:59:59"
        System.out.println(secToString(-1));         // Should return "xx:xx:xx" for invalid input
        System.out.println(secToString(86400));      // Should return "xx:xx:xx" for invalid input
    }
}
