package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 프로그램 : 실행가능한 코드 덩어리
        // 프로세스 : 프로그램을 실행하여 메모리에 올라와있는 프로그램
        // 쓰레드 : 프로세스 안에서 자원 ( 각 쓰레드는 다른 쓰레드에 영향을 미치지 않는다)

        // 자바프로그램에서는 개발자가 따로 설정해 주지않는이상 1프로세스에는 1쓰레드만 갖게됨

//        cleanBySelf();

        // 직원 청소
        CleanThread cleanThread = new CleanThread();
        cleanThread.start();

        // 사장 청소
        cleanByBoss();
    }

    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(혼자) " + i + " 번방 청소중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanByBoss(){
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("(사장) " + i + " 번방 청소중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
