package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 : 불필요한건 숨기고 필요한것만 드러냄
        // abstract
        // 추상 클래스 : 완성되지 않은 클래스
        // 추상 메소드 : 추상 클래스 , 추상 인터페이스에서만 사용하는한 완성되지 않은 메소드

//    Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

    }
}
