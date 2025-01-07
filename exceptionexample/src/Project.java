// Class to represent a project
class Project {
    private String projectName;
    private int duration; // Duration in months
    private double budget;

    public Project(String projectName, int duration, double budget) {
        this.projectName = projectName;
        this.duration = duration;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Project Name: " + projectName + ", Duration: " + duration + " months, Budget: $" + budget;
    }
}
