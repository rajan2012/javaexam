import java.util.Scanner;

class TechnicalDictionary {
    private Entry[] entries;
    private Scanner scanner;

    // Constructor
    public TechnicalDictionary(Scanner scanner) {
        this.scanner = scanner;
        this.entries = new Entry[1000]; // Initialize array with null references
    }

    // Add a new entry
    public void enter(String technicalTerm, String explanation) {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] == null) {
                entries[i] = new Entry(technicalTerm, explanation);
                break;
            }
        }
    }

    // Practice the least learned term
    public void exercise() {
        //what does below one mean
        //just reference to one object like we use ar[0]=min
        //likewise referencing to one for comaprison
        Entry leastLearned = entries[0];

        // Find the least learned entry
        for (Entry entry : entries) {
            //when leastlearned is null ,how comparison works
            if (entry != null && (leastLearned == null || entry.getLearned() < leastLearned.getLearned())) {
                leastLearned = entry;
            }
        }

        if (leastLearned == null) {
            System.out.println("No entries available for practice.");
            return;
        }

        // Ask user about the term
        System.out.println("Do you know the explanation of this term? " + leastLearned.getTechnicalTerm());
        String userResponse = scanner.nextLine();

        if (userResponse.isEmpty()) {
            System.out.println("The explanation is: " + leastLearned.getExplanation());
            System.out.println("Did you actually know the explanation? (Press Enter for yes, type anything for no)");
            userResponse = scanner.nextLine();
            if (userResponse.isEmpty()) {
                leastLearned.setLearned(leastLearned.getLearned() + 1); // Increase knowledge
            } else {
                leastLearned.setLearned(leastLearned.getLearned() / 2); // Halve knowledge
            }
        } else {
            leastLearned.setLearned(leastLearned.getLearned() / 2); // Halve knowledge
        }
    }

    // toString method to print all entries
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                sb.append(entry.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}