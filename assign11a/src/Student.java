public class Student extends UniMember {
    private static int matriculationCounter = 1;
    private int matriculationNumber;

    public Student(String firstName, String lastName, String address) {
        super(firstName, lastName, address);
        this.matriculationNumber = matriculationCounter++;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matriculation Number: " + matriculationNumber;
    }
}
