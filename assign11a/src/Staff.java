public class Staff extends UniMember {
    private static int staffCounter = 1000;
    private int staffNo;
    private String room;
    private String phoneNumber;

    public Staff(String firstName, String lastName, String address, String room, String phoneNumber) {
        super(firstName, lastName, address);
        this.staffNo = staffCounter++;
        this.room = room;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Staff Number: " + staffNo +
                ", Room: " + (room != null ? room : "N/A") +
                ", Phone: " + (phoneNumber != null ? phoneNumber : "N/A");
    }
}
