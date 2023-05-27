package chap_12;

import chap_12.clean.Room;

public class _05_Synchronization {
    public static void main(String[] args) {

        Room room = new Room();
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                String name = "직원1";
                System.out.println("-- " + name + " 청소 시작 (Runnable)--");
                for (int i = 1; i <= 5; i ++) {
                    room.clean(name);
                    try {
                        Thread.sleep(1000);
                        if( i==2 ){
                            throw new InterruptedException("못해먹겠다");
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("-- " + name + " 청소 끝 (Runnable) --");
            }
        };


        Runnable runnable2 = () -> {
            String name = "직원2";
            System.out.println("-- " + name + " 청소 시작 (Runnable)--");
            for (int i = 1; i <= 5; i ++) {
                room.clean(name);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("-- " + name + " 청소 끝 (Runnable) --");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}
