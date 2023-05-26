package chap_07.camera;

public class FactoryCam extends Camera {
    public FactoryCam() {
        super("공장 카메라");
    }

    public void takePicture() {
        super.takePicture();
        detectFire();
    }

    public void detectFire() {
        System.out.println("화제를 감지합니다");
    }

    @Override
    public void showMainFeature(){
        System.out.println(this.name+"의 주요기능 : 화재감지");
    }
}
