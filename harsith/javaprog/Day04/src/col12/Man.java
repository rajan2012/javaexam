package col12;

public class Man extends Human {
    public Man(String name) {
        super(name);
    }

    public Man(String name, Man father, Women mother) {
        super(name, father, mother);
    }
}

