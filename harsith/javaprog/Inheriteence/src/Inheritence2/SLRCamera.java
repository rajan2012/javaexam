package Inheritence2;

public class SLRCamera extends Camera {

    private String lensName;

    public SLRCamera(String model, String lensName) {
        super(model, true);
        this.lensName = lensName;
    }

    @Override
    public void takePicture() {

        pictures++;
        System.out.println("Taking picture with SLR Camera (Lens: " + lensName + ") - " + this);

    }


}
