import java.util.Scanner;

public class Main {

    public static boolean containsFragment(String[] names, String fragment) {



        for (int i=0; i< names.length;i++) {
            if(names[i].toLowerCase().contains(fragment.toLowerCase())){
                return true;
            }
        }
        return false; // Fragment not found in any name
    }



    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] names = new String[2];
            for (int i = 0; i < names.length; i++) {
                System.out.print("name[" + i + "] = ");
                names[i] = sc.nextLine();
            }

            System.out.print("Fragment: ");
            String fragment = sc.nextLine();
            System.out.print("Contained: " + containsFragment(names, fragment));
        }
    }
