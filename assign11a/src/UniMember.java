public class UniMember {
    private String firstName;
    private String lastName;
    private String address;

    public UniMember(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Address: " + address;
    }
}
