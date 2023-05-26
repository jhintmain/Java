package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성 (is-a 관계)

        // class Person : 사람
        // class Student extends Person : 학생
        // class Teacher extends Person : 선생

        // 부모클래스의 Type 으로 선언해도 된다 (is -a 관계)
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("--------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        System.out.println("--------------");

        // 부모 Type으로 선언해서 자식내 추가된 메소드는 사용몬함.
//        factoryCam.detectFire();
//        speedCam.checkSpeed();
//        speedCam.showMainFeature();


        // 자식 메소드 사용하려면 instanceof로 체크
        if(camera instanceof Camera){
            System.out.println("카메라입니다.");
        }

        if(factoryCam instanceof FactoryCam){
            ((FactoryCam) factoryCam).detectFire();
        }

        if(speedCam instanceof SpeedCam){
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

        // 모든 클래스의 조상 > 어떤 클래스든 Object형으로 받아서 쓸 수있음
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new SpeedCam();


    }
}
