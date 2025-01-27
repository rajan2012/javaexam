package col12;

public class Women extends Human{

    public Women(String name) {
        super(name);
    }

    public Women(String name, Man father, Women mother) {
        super(name, father, mother);
    }
}
