public class PhoneBookEntry {
    String name;
    String number;

    public PhoneBookEntry(String name,String number)
    {
        this.name=name;
        this.number=number;
    }

    public String getName() {
        return name;
    }

    // Getter for number
    public String getNumber() {
        return number;
    }

    // Setter for number
    public void setNumber(String number) {
        this.number = number;
    }
}
