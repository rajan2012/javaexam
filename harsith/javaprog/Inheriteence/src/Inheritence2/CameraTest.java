package Inheritence2;

public class CameraTest {
    public static void main(String[] args) {
        Camera smartphone = new Smartphone("Galaxy S21");
        Camera slrCamera = new SLRCamera("Canon EOS 5D", "EF 24-70mm");

        smartphone.takePicture();
        slrCamera.takePicture();
    }
}
