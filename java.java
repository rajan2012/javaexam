 Move All Zeros to the End
  int index=0;
        for(int i=0;i<5;i++)
        {
            if(a[i]==0)
            {
                b[5-(index+1)]=a[i];
                index++;
            }
        }
        
        int index2=0;
         for(int i=0;i<5;i++)
        {
            if(a[i]!=0)
            {
                b[index2]=a[i];
                index2++;
            }
        }


 Find the Missing Number in an Array (1 to N)
  return total - sum; 



   Find All Pairs with a Given Sum
    public static List<int[]> findPairs(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) pairs.add(new int[]{complement, num});
            seen.add(num);
        }
        return pairs;
    }


    Adds a new integer array to the pairs list.
new int[]{complement, num}:
Creates a new array with two elements: complement and num.


##adding array to set 
    // Arrays to be stored in a set
        int[] arr1 = {1, 2, 3};
     // Convert arrays to strings before adding
        set.add(Arrays.toString(arr1));




  // Adding arrays as values
        map.put("first", new int[]{1, 2, 3});




   ############for recursive 

        Base Case:
The recursive approach requires a base case to terminate the
 recursion. Without a base case, the recursion would continue indefinitely, 
 resulting in a stack overflow.


 #################class ############

     private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

 for (Employee emp : employees) {
                System.out.println(emp);
            }


         After Object Creation:

You use setters when you need to modify or update the values of an object's fields after the object has been created.
Setters are useful when you don't want to initialize all fields through the constructor, or if some fields might change 
during the object's lifetime.

String name;
int age;
String role;

public Employee(String name, String role, int age) {
    this.name = name;
    this.age = age;
    this.role = role;
}



Instance Variables (Fields):
The variables name, age, and role are instance variables because they are declared inside 
the class but outside of any methods. These variables are associated with individual instances (objects) of the Employee class, meaning each Employee object can have its own unique values for these fields.

String name; - This stores the employee's name.
int age; - This stores the employee's age.
String role; - This stores the employee's role/designation.
2. Constructor:
The constructor public Employee(String name, String role, int age) is used to initialize 
an instance of the Employee class. The constructor receives values for name, role, and age as parameters.

    ######################

#####################imp when object value given in arra##################

import java.util.Scanner;

class Employee {
    private String name;
    private String designation;
    private int age;

    // Constructor
    public Employee(String name, String designation, int age) {
        this.name = name;
        this.designation = designation;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Designation: " + designation + ", Age: " + age;
    }
}

class EmployeeManager {
    private Employee employee;

    // Constructor to initialize with an Employee object
    public EmployeeManager(String name, String designation, int age) {
        this.employee = new Employee(name, designation, age);
    }

    // Method to display employee details
    public void displayEmployee() {
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("No employee found.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for number of employees
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Initialize an array of EmployeeManager
        EmployeeManager[] managers = new EmployeeManager[n];

        // Collect employee data and initialize each EmployeeManager
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            // Get user input for name, designation, and age
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter designation: ");
            String designation = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            // Initialize EmployeeManager with constructor parameters
            managers[i] = new EmployeeManager(name, designation, age);
        }

        // Display employee details
        System.out.println("\n--- Employee List ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ": ");
            managers[i].displayEmployee();
        }
    }
}


##################################


Why does nextLine() fail after using next()?
When you use sc.next() to read a string, it only reads the part before the first whitespace (i.e., until a space or a 
newline is encountered),
 but it does not consume the newline character (\n) that the user types after entering the input. So when you call sc.nextLine(), 
 it immediately reads the leftover newline character (\n), effectively skipping any input.

     // Constructor to initialize Employee object
    public Employee(String name, String role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;

        // Here, we can initialize 'e' as a new Employee (nested within itself)
        this.e = new Employee(name, role, age);
    }


#######exception in class 

  if (age < 18) {
        throw new IllegalArgumentException("Age must be 18 or older.");
    }


private Employee employee;
 if (employee != null) {
            System.out.println(employee);
        }



this line 
System.out.println(e); calls tostring ovveride method and display result 
#################

constructor ##################

public employee(){};
public employee(String name, String role, int age)
{
   // e=new employee(name,role,age);
    if(age<18)
    {
        throw new IllegalArgumentException("age must be more than 18");
    }
    this.name=name;
    this.age=age;
    this.role=role;
}


How to Create a Custom Exception (Recap)
A custom exception is a user-defined class that extends Exception (or RuntimeException).
 Here's how InvalidAgeException is created in the example:

##create exception for extra custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Passes the message to the parent class (Exception)
    }
}



###2.




############################


Instance Method Invocation:

checkAge() is a method defined in the Employee class, and it operates on the data (fields) of a specific Employee object.
To call it, you need an instance of the Employee class (like f in your example).
java
Copy code
f.checkAge(f.getAge());


Why Not Use checkAge(f.getAge());?
Compilation Error:

Without the f., the checkAge() method is treated as a static method or as a method belonging to the same class as main().
Since checkAge() is not declared as static in the Employee class, you cannot call it directly from a static context (like main()).


when use 

public static void checkAge(int age) throws InvalidAgeException {
    if (age < 18) {
        throw new InvalidAgeException("Age must be at least 18.");
    } else {
        System.out.println("Age is valid: " + age);
    }
}

then checkage(age)directly 


if   public void checkAge(int age) throws AgeException { // Fixed exception naming
        if (age < 18) {
            throw new AgeException("Age must be greater than or equal to 18.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    then f.checkage(age)



  ##  ################explanation ############

  In Java, the throws keyword is used in a method declaration to indicate that the method might throw one or more exceptions. In the given code:

java
Copy code
// Method to demonstrate custom exception handling
public static void checkAge(int age) throws InvalidAgeException {
    if (age < 18) {
        throw new InvalidAgeException("Age must be at least 18.");
    } else {
        System.out.println("Age is valid: " + age);
    }
}

--throws in method but inside throw #### very imp 
Here’s an explanation of the two usages:

1. throws InvalidAgeException in the Method Signature
Purpose:

Declares that the method checkAge might throw an InvalidAgeException.
This is a contract with the caller of the method, informing them that they must handle this exception.
When It's Required:

It's mandatory to include the throws clause in the method signature if the method might throw a checked exception
 like InvalidAgeException.
Checked exceptions are exceptions that the compiler requires you to explicitly handle or declare. They must either 
be caught in a try-catch block or propagated up the call stack using the throws clause.


new InvalidAgeException("Age must be at least 18."); creates an instance of the InvalidAgeException class, with 
a message indicating the error.

 try {
            // Check the age of the employee
            Employee.checkAge(age); // Fixed method naming conventions
        } catch (AgeException e) { // Use proper naming for exceptions
            System.out.println(e.getMessage());
        }

e (which is an instance of AgeException).



Checked exceptions are those that are explicitly declared to be thrown, and the caller is required 
to handle them (either with try-catch or by throwing them further).


An unchecked exception is one that extends RuntimeException. These exceptions are not required to be declared 
in the method signature using throws and can be handled optionally.

In the case of your checkSalary() method, it throws an InvalidSalaryException, which appears 
to extend RuntimeException (a runtime exception).


When to Use Checked vs. Unchecked Exceptions
Use checked exceptions when the exception represents a condition that is expected and recoverable, and you want to force the caller to handle the exception (e.g., invalid user input, out-of-bounds data).
Use unchecked exceptions for programming errors or conditions that you don't expect the caller to recover from (e.g., null pointer, array index out of bounds).


multiple exception callin getAge
  try {
            // Try to check the age and salary for employee1
            System.out.println("Checking Employee1...");
            employee1.checkAge(); // This will throw an exception because salary < 3000
            employee1.checkSalary(); // This will throw an exception because salary is invalid

        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } catch (InvalidSalaryException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("Caught a general exception: " + e.getMessage());
        }


###########when filling value of employee using scanner and alos initilizing object of other class 
private Person[] persons; // Array to store Person objects
    private String name;
    private int age;

    // Constructor to initialize Employee and its Person array
    public Employee(Scanner sc) {
        persons = new Person[3]; // Initialize the array
        for (int i = 0; i < persons.length; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            String name = sc.next();
            System.out.print("Enter age for person " + (i + 1) + ": ");
            int age = sc.nextInt();
            persons[i] = new Person(name, age); // Initialize each Person object
        }
    }

##here using person[] 
     public person[] getperson()
    {
        ##return array of person type like array of int or string 
        return persons;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Employee Details:\n");
        for (Person person : persons) {
            result.append(person).append("\n");
        }
        return result.toString();
    }


    // Check age for each person
    ##looping through person array 
        for (Person person : employee.getPersons()) {
            try {
                Employee.checkAge(person.age); // Validate the age of each person
            } catch (AgeException e) {
                System.out.println(e.getMessage());
            }
        }


  public int getAge() { // Fixed method name to match camelCase convention
        for(int i=0;i<3;i++)
        {
           if(p[i].name.equals("raj"))
            {
                p[i].age=35;
            }
        }
        return age;
    }

    same can be done with setage 


      public int getAge() { // Fixed method name to match camelCase convention
       int age2=0;
        for(int i=0;i<3;i++)
        {
           if(p[i].name.equals("raj"))
            {
                p[i].age=35;
                age2= p[i].age;

            }
        }
        return  age2;
    }


    another variation where project is another class 

    here in constructor comes object of project 

private String name;
    private int age;
    private Project[] projects;


     public Employee(String name, int age, Project[] projects) {
        this.name = name;
        this.age = age;
        this.projects = projects;
    }

here only 1 employee and then have number of projects ,
    ##filling project content in main only 

     Project[] projects = new Project[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Project " + (i + 1) + " Name: ");
            String projectName = sc.next();

            System.out.print("Enter Project " + (i + 1) + " Duration (months): ");
            int duration = sc.nextInt();

            projects[i] = new Project(projectName, duration);
        }


in main i need to define  Project[] projects = new Project[n]; if gives Project[] projects ,it gives error 
but in another class , Project[] projects is valid 

reason 

Initialization: To allocate memory for the array and specify its size, you must initialize it:

java
Copy code
projects = new Project[n];
This step creates an array that can hold n references to Project objects, but these references are initially null.

#####################

  private String name;
    private int age;
    private Project[] projects;

    public Employee(String name, int age, Project[] projects) {
        this.name = name;
        this.age = age;
        this.projects = projects;
    }


    


    ############################### array of empployee has array of projects ####################

     private String name;
    private int age;
    private Project[] projects; ---same as of constructor 

    public Employee(String name, int age, Project[] projects) {
        this.name = name;
        this.age = age;
        this.projects = projects;
    }



 public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Projects:");
        for (Project project : projects) {
            System.out.println("\t" + project);
        }
    }


array of employee with array of project ------------------------------


        Employee[] emp=new Employee[n2];

        for(int j=0;j<n2;j++)
        {
            System.out.print("Enter Employee Name: ");
            String name = sc.next();

            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            System.out.print("Enter number of projects: ");
            int n = sc.nextInt();

            Project[] projects = new Project[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Project " + (i + 1) + " Name: ");
                String projectName = sc.next();

                System.out.print("Enter Project " + (i + 1) + " Duration (months): ");
                int duration = sc.nextInt();

                projects[i] = new Project(projectName, duration);
            }

            emp[j]=new Employee(name, age, projects);
        }

        for(Employee e:emp) {
            e.displayDetails();
        }


    ####################################################################################


when private Project[] project;  is defined in  employee , it will be filled in constructor 

  // Constructor to initialize Employee and its Person array
    public Employee(Scanner sc) {
        persons = new Person[3]; // Initialize the array
        for (int i = 0; i < persons.length; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            String name = sc.next();
            System.out.print("Enter age for person " + (i + 1) + ": ");
            int age = sc.nextInt();
            project[i] = new Project(name, age); // Initialize each Person object
        }
    }

##here using person[] 
     public person[] getperson()
    {
        ##return array of person type like array of int or string 
        return persons;
    }

--------------------------------

class Employee {
    private String name;
    private int age;
    private Project[] projects;

    // Constructor to initialize employee and project details
    public Employee(String name, int age, int numProjects, Scanner sc) {
        this.name = name;
        this.age = age;
        this.projects = new Project[numProjects];
        addProjects(sc); // Add project details using a method
    }

    // Method to add project details
    private void addProjects(Scanner sc) {
        for (int i = 0; i < projects.length; i++) {
            System.out.print("Enter Project " + (i + 1) + " Name: ");
            String projectName = sc.next();
            System.out.print("Enter Project " + (i + 1) + " Duration (months): ");
            int duration = sc.nextInt();
            projects[i] = new Project(projectName, duration); // Create and add project
        }
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Projects:");
        for (Project project : projects) {
            System.out.println("\t" + project);
        }
    }
}



 Employee emp = new Employee(name, age, numProjects, sc);


 ################

 class Department {
    private String departmentName;
    private Employee[] employees;

    public Department(String departmentName, int numEmployees, Scanner sc) {
        this.departmentName = departmentName;
        this.employees = new Employee[numEmployees];
        addEmployees(sc);
    }

 }


and called using getprojects 
####################reason #################

Case 1: Works Fine in the Constructor
java
Copy code
private Employee[] employees;

public Department(String departmentName, int numEmployees, Scanner sc) {
    this.departmentName = departmentName;
    this.employees = new Employee[numEmployees]; // Array initialized here
    addEmployees(sc); // The array is already initialized when this method is called
}
In this case:
The array employees is declared as a field of the class.
It's initialized in the constructor before it's used (via addEmployees(sc) or other methods).
As a result, the array is ready to be populated with Employee objects when addEmployees(sc) is called, so there’s no issue.



Case 2: Fails in Main Class
java
Copy code
Employee[] employees; // Array is declared but not initialized
employees = new Employee[numEmployees]; // Initialization happens later
Here, the difference is when and how the array is accessed:
The array is declared but not initialized until the second line (employees = new Employee[numEmployees];).
If you try to use the array (e.g., employees[i] = new Employee(...)) before initialization, it will throw a NullPointerException because the reference 
employees is still null at that point.


Employee[] employees;
employees[0] = new Employee("John", 25, 3); // This will throw NullPointerException
employees = new Employee[numEmployees];    // Array initialized too late


correct way to initlize in 2 line #########################


Employee[] employees = null; // Declare the array

employees = new Employee[numEmployees]; // Initialize the array

#############################

 Department department = new Department(departmentName, numEmployees, sc);


 ###################

 comaring instance of object 



 ##############abstract class ##################


 // Abstract class for a general person
abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayDetails(); // Abstract method
}


class Employee extends Person {
    private String role;
    private ArrayList<Project> projects;

    public Employee(String name, int age, String role) throws InvalidDataException {
        super(name, age);
        if (age < 18) {
            throw new InvalidDataException("Employee age must be at least 18.");
        }
        this.role = role;
        this.projects = new ArrayList<>();  -------------arralist 
    }

    public void addProject(Project project) {
        projects.add(project);
    }

}


class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

}

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

Department department = new Department(departmentName);

 for (int i = 0; i < numEmployees; i++) {
                System.out.println("Enter details for Employee " + (i + 1) + ":");
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Age: ");
                int age = sc.nextInt();
                System.out.print("Role: ");
                String role = sc.next();

                Employee employee = new Employee(name, age, role);
                department.addEmployee(employee); --can also be  department.add(new Employee(name, age, role))

 }




#########

finally {
            sc.close();
        }



  if (list == null || list.isEmpty()) {
            return "[]"; // Return empty array representation if list is null or empty
        }



        #########throw in constructor ###########

when name ,age coming from super, dont declare local name and age
         public Employee(String name, int age, String role) throws InvalidDataException {
        super(name, age);
        if (age < 18) {
            throw new InvalidDataException("Employee age must be at least 18.");
        }
        this.role = role;
        this.projects = new ArrayList<>(); // Initialize the projects list
    }


#################################################



for this 


lass Employee extends Person {
    private String role;
    private ArrayList<Project> projects;

    public Employee(String name, int age, String role) throws InvalidDataException {
        super(name, age);
        if (age < 18) {
            throw new InvalidDataException("Employee age must be at least 18.");
        }
        this.role = role;
        this.projects = new ArrayList<>(); // Initialize the projects list
    }

}

the line this.projects = new ArrayList<>(); inside the constructor is used to initialize the 
projects field only when an Employee object is created, ensuring that the field is set up with an
 empty list at the time of object creation.


 Initialization at the time of object creation: This ensures that the projects field is initialized only when the Employee
  object is created.
The constructor is the right place to initialize fields that depend on parameters passed to the constructor or require logic before 
being initialized.
In this case, initializing the projects list inside the constructor guarantees that the list is
 initialized only when the object is instantiated with valid data (e.g., age >= 18).


 Why Not Initialize with the Declaration?
java
Copy code
private ArrayList<Project> projects = new ArrayList<>(); // Not initialized here in this example
If you initialize the projects field at the point of declaration, it will still work and the list will be initialized with an empty 
ArrayList when the Employee object is created.



you generally want to initialize fields inside the constructor to ensure that you have full control over when and how they are initialized.



####################################

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

    ##########################

here only 2 variable in Employee 

    class Employee extends Person {
    private String role;
    private List<Project> projects;

    public Employee(String name, int age, String role) throws InvalidDataException {
        super(name, age); // Call the constructor of the Person class
        if (age < 18) {
            throw new InvalidDataException("Employee age must be at least 18.");
        }
        this.role = role;
        this.projects = new ArrayList<>();
    }


    }


###############################################################


    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }


    #######################

    The super(name, age) ensures that when an Employee object is created, it properly 
    initializes both the properties from the Person class (like name and age) and the properties specific to Employee (like city).


Inheritance requires the subclass (Employee) to initialize the fields inherited from the parent class (Person) using super().
If you don't call super(), Java will not automatically initialize the fields of the superclass.

In Java, when one class extends another, it inherits all public and protected methods

In Java, when one class extends another, it inherits all public and protected methods (except constructors) from the superclass, 
unless the subclass overrides those methods.

So, if Employee extends Person, and you create an Employee object, that object will have access to the display() method from 
the Person class.


    #################



