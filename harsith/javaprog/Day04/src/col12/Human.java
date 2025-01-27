package col12;

public class Human {

    private static int nextId = 1000;

    private String name;
    private int id;

    private Man father;
    private Women mother;

    public Human(String name) {
        this.name = name;
        this.id = nextId++;
        this.father = null;
        this.mother = null;

    }

    public Human(String name, Man father, Women mother) {
        this.name = name;
        this.id = nextId++;
        this.father = father;
        this.mother = mother;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Man getFather() {
        return father;
    }

    public Women getMother() {
        return mother;
    }
}
