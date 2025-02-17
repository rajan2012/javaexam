public class Assistant extends Staff {

    private Professor supervisor;

    public Assistant(String firstName, String lastName, String address, String room, String phoneNumber, Professor supervisor) {
        super(firstName, lastName, address, room, phoneNumber);
        this.supervisor = supervisor;
        supervisor.addAssistant(this);
    }

    public void resign() {
        if (supervisor != null) {
            supervisor.removeAssistant(this);
            supervisor = null;
        }
    }

    public boolean employed() {
        return supervisor != null;
    }

    @Override
    public String toString() {
        return super.toString() + ", Supervisor: " + (supervisor != null ? supervisor.toString() : "None");
    }
}
