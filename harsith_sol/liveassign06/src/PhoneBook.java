import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

   static List<PhoneBookEntry> pb=new ArrayList<>();

   public static void change(String name,String number)
    {
        for(PhoneBookEntry p:pb)
        {
            if(p.getName().equals(name))
                {
                    p.setNumber(number);
                   // return;
                }
                //rater than this add ,because u are not using p here
                //p=new PhoneBookEntry(name,number);


        }
        pb.add(new PhoneBookEntry(name,number));
    }

    public static void change2(String name, String number) {
        for (PhoneBookEntry entry : pb) {
            if (entry.getName().equals(name)) {
                // If the name already exists, update the number
                entry.setNumber(number);
                return;
            }
        }
        // If the name does not exist, add a new entry
        pb.add(new PhoneBookEntry(name, number));
    }


    public static String searchNumber(String name)
    {
        for(PhoneBookEntry p:pb)
        {
            if(p.getName().equals(name))
                {
                    return p.getNumber();
                }
        }
        return "unknown";
    }


    // Method to search for a phone number by name
    public static String searchNumber2(String name) {
        for (PhoneBookEntry entry : pb) {
            if (entry.getName().equals(name)) {
                // Return the phone number if the name is found
                return entry.getNumber();
            }
        }
        // Return "unknown" if the name is not found
        return "unknown";
    }



}
