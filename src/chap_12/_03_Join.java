package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            // 쓰레드 종료 될때까지 기다려라
            thread.join(2500);  // 시간동안 기다리다 안끝나면 넘어감 아래루
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss(){
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("(사장) " + i + " 번방 청소중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
