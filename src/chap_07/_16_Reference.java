package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조

        // 기본 자료혐 : int, long, double, float, boolean
        // 기본값이 존재 , 메소드 없음
        int[] i = new int[3];
        System.out.println(i[0]);   // 0

        double[] d = new double[3];
        System.out.println(d[0]);   // 0.0

        // 참조 자료형 : String, Camera, FactoryCam...
        // 기본값 = null , 대문자로 시작
        String[] s = new String[3];
        System.out.println(s[0]);   // null

        System.out.println("------- 기본자료형의 = 은 단순 복사 ------");
        int a = 10;
        int b = 20;
        b =a;
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        b = 30;
        System.out.println("a : "+a);
        System.out.println("b : "+b);

        System.out.println("------- 참조 의 = 는 참조를 바꾸라는 뜻 ------");

        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1;
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);

    }
}
