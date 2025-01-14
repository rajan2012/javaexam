import java.util.ArrayList;

public class Professor extends Staff {
    private ArrayList<Assistant> assistants;

    public Professor(String firstName, String lastName, String address, String room, String phoneNumber) {
        super(firstName, lastName, address, room, phoneNumber);
        assistants = new ArrayList<>();
    }

    public void addAssistant(Assistant assistant) {
        if (assistants.size() < 10) {
            assistants.add(assistant);
        } else {
            System.out.println("Maximum number of assistants reached.");
            System.exit(0);
        }
    }

    public void removeAssistant(Assistant assistant) {
        assistants.remove(assistant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString() + ", Assistants: ");
        for (Assistant assistant : assistants) {
            sb.append("\n  - ").append(assistant);
        }
        return sb.toString();
    }
}
