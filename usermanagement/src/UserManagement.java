import java.util.Arrays;
import java.util.*;
import java.util.logging.Logger;

public class UserManagement {
    private static final int MAX_USERS = 100;
    private static String adminPassword = null;
    private final String[] id = new String[MAX_USERS];
    private final String[] pw = new String[MAX_USERS];

    public UserManagement() {
        Arrays.fill(id, null);
        Arrays.fill(pw, null);

        for(int i=0;i<100;i++)
        {
            id[i]=null;
            pw[i]=null;
        }
    }

    public boolean newUser(String name, String password) {
        if (name.length() < 4 || password.isEmpty()) {
            return false;
        }

        for (int i = 0; i < MAX_USERS; i++) {
            if (id[i] != null && id[i].equals(name)) {
                return false; // User already exists
            }
        }

        for (int i = 0; i < MAX_USERS; i++) {
            if (id[i] == null) {
                id[i] = name;
                pw[i] = password;
                return true;
            }
        }

        return false; // No space for new user
    }

    public boolean checkPassword(String name, String password) {
        for (int i = 0; i < MAX_USERS; i++) {
            if (id[i] != null && id[i].equals(name) && pw[i].equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean changePassword(String name, String oldPw, String newPw) {
        if (newPw.length() < 8) {
            return false;
        }

        for (int i = 0; i < MAX_USERS; i++) {
            if (id[i] != null && id[i].equals(name) && pw[i].equals(oldPw)) {
                pw[i] = newPw;
                return true;
            }
        }
        return false;
    }

    public static void setAdmin(String adminPw) {
        if (adminPw.length() < 8) {
            return; // Ignore passwords that are too short
        }

        if (adminPassword != null) {
            //logger.warning("Unauthorized access");
            System.out.println("Unauthorized access");
        } else {
            adminPassword = adminPw;

        }
    }

    public void setPassword(String adminPw, String name, String newPw) {
        if (!adminPw.equals(adminPassword) || newPw.isEmpty()) {
            return; // Do nothing if admin password is incorrect or new password is empty
        }

        for (int i = 0; i < MAX_USERS; i++) {
            if (id[i] != null && id[i].equals(name)) {
                pw[i] = newPw;
                break;
            }
        }
    }
}
