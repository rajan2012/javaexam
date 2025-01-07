import java.util.ArrayList;

// Class to represent an employee
class Employee extends Person { 
    private String role;
  //  private ArrayList<Project> projects;

    private ArrayList<Project> projects  =new ArrayList<>();

    public Employee(String name, int age, String role) throws InvalidDataException {
        super(name, age);
        if (age < 18) {
            throw new InvalidDataException("Employee age must be at least 18.");
        }
        this.role = role;
        //this.projects = new ArrayList<>(); // Initialize the projects list
    }

    // Method to add a project
    public void addProject(Project project) {
        if (projects == null) {
            projects = new ArrayList<>(); // Ensure projects is initialized
        }

        if (project != null) {
            projects.add(project); // Add project only if it's not null
            System.out.println("Project '" + project.toString() + "' added successfully.");
        } else {
            System.out.println("Cannot add a null project.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        System.out.println("Projects:");
        if (projects.isEmpty()) {
            System.out.println("\tNo projects assigned.");
        } else {
            for (Project project : projects) {
                System.out.println("\t" + project);
            }
        }
    }
}
