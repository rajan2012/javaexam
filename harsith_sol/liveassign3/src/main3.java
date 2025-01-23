//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main3 {

    static String secToString(int k)
    {
       int hr=k/3600;

       int rem1=k%3600;

       int min=rem1/60;

       int sec=rem1%60;

     //  int sec=rem2/60;

        if(k<0||k>=86400)
            return "xx:xx:xx";

        //convert into this forat and its of string type


       // System.out.println();

        return String.format("%02d:%02d:%02d",hr,min,sec);

    }

    public static void main(String[] args) {

       String s=secToString(121);

        System.out.println(secToString(121));    // "00:02:01"
        System.out.println(secToString(86399));  // "23:59:59"
        System.out.println(secToString(86400));  // "xx:xx:xx"
        System.out.println(secToString(-1));

    }
}