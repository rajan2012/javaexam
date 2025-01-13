//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserManagement bv1 = new UserManagement();

        boolean check;
        check = bv1.newUser("longName","easy");
        System.out.println("01 New User: " + check );

        check = bv1.newUser("longName","longerpassword");
        System.out.println("02 New User: " + check );

        check = bv1.newUser("sht","again");
        System.out.println("03 New User: " + check );

        check = bv1.checkPassword("longName","easy");
        System.out.println("04 Check Password: " + check );

        check = bv1.checkPassword("longName","muchlongerpassword");
        System.out.println("05 Check Password: " + check );

        check = bv1.changePassword("longName","easy","anotherPw");
        System.out.println("06 Change Password: " + check );

        check = bv1.changePassword("longName","wrong","anotherPw");
        System.out.println("07 Change Password: " + check );

        UserManagement.setAdmin("short");
        UserManagement.setAdmin("longenough");

        System.out.print("08 AdminPW: ");
        UserManagement.setAdmin("forbidden");

        UserManagement bv2 = new UserManagement();

        check = bv2.newUser("longName","thatsOK");
        System.out.println("09 New User: " + check );

        bv2.setPassword("longenough", "longName","shrt");
        check = bv2.checkPassword("longName","shrt");
        System.out.println("10 Admin Change Password: " + check );
    }
}