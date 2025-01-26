package Inheritence2;

public class Smartphone extends Camera{

    public Smartphone(String model) {
        super(model, false);
    }

    @Override
    public void takePicture() {
        pictures++;
        System.out.println("Taking picture with Smartphone - " + this);
    }
}
