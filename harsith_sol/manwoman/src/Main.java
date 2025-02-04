import java.util.concurrent.atomic.AtomicInteger;

// Base Human class
class Human {
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    private final int id;
    private final String name;
    private final Woman mother;
    private final Man father;

    // Constructor with only name
    public Human(String name) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.name = name;
        this.mother = null;
        this.father = null;
    }

    // Constructor with name, mother, and father
    public Human(String name, Woman mother, Man father) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Woman getMother() {
        return mother;
    }

    public Man getFather() {
        return father;
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', id=" + id +
                ", mother=" + (mother != null ? mother.getName() : "Unknown") +
                ", father=" + (father != null ? father.getName() : "Unknown") + "}";
    }
}

// Man subclass
class Man extends Human {
    public Man(String name) {
        super(name);
    }

    public Man(String name, Woman mother, Man father) {
        super(name, mother, father);
    }
}

// Woman subclass
class Woman extends Human {
    public Woman(String name) {
        super(name);
    }

    public Woman(String name, Woman mother, Man father) {
        super(name, mother, father);
    }
}

// Testing the Family Tree
public class Main {
    public static void main(String[] args) {
        Woman grandma = new Woman("Anna");
        Man grandpa = new Man("John");

        Woman mother = new Woman("Emma", grandma, grandpa);
        Man father = new Man("Michael");

        Human child1 = new Human("Alice", mother, father);
        Human child2 = new Human("Bob", mother, father);

        // Print family details
        System.out.println(child1);
        System.out.println(child2);
    }
}
