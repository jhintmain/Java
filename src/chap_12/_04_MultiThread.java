package chap_12;

public class _04_MultiThread {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            String name = "직원1";

            @Override
            public void run() {
                System.out.println("-- " + name + " 청소 시작 (Runnable)--");
                for (int i = 1; i <= 10; i += 2) {
                    System.out.println("(" + name + ") " + i + " 번방 청소중 (Runnable) ");

                    try {
                        Thread.sleep(1000);
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
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("(" + name + ") " + i + " 번방 청소중 (Runnable) ");

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
