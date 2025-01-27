package Inheritence2;

abstract  class Camera {

    private static int count =0;

    protected String model;
    protected int id;
    protected int pictures = 0;
    protected boolean hasLens;


    public Camera(String model, boolean hasLens) {
        this.id = count++;
        this.model = model;
        this.hasLens = hasLens;
    }


    @Override
    public String toString() {
        return "Camera{" +
                "model='" + model + '\'' +
                ", id=" + id +
                ", pictures=" + pictures +
                ", hasLens=" + hasLens +
                '}';
    }

    public abstract void takePicture();
}

