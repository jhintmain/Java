package chap_07.camera;

public class SpeedCam extends Camera{
    public SpeedCam() {
        super("과속단속 카메라");
    }

    public void takePicture(){
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed(){
        System.out.println("속도를 측정합니다");
    }

    public void recognizeLicensePlate(){
        System.out.println("차량번호를 인식합니다");
    }

    @Override
    public void showMainFeature(){
        System.out.println(this.name+"의 주요기능 : 속도측정, 차량번호인식");
    }
}
