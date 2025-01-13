import java.util.Scanner;

class Entry {
    private String technicalTerm;
    private String explanation;
    private double learned;

    // Constructor
    public Entry(String technicalTerm, String explanation) {
        this.technicalTerm = technicalTerm;
        this.explanation = explanation;
        this.learned = 0;
    }

    // Getters and Setters
    public String getTechnicalTerm() {
        return technicalTerm;
    }

    public void setTechnicalTerm(String technicalTerm) {
        this.technicalTerm = technicalTerm;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public double getLearned() {
        return learned;
    }

    public void setLearned(double learned) {
        this.learned = learned;
    }

    // toString method
    @Override
    public String toString() {
        return technicalTerm + ": " + explanation + " (Knowledge: " + learned + ")";
    }
}