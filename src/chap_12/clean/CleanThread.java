package chap_12.clean;

public class CleanThread extends Thread{
    @Override
    public void run() {
        System.out.println("-- 혼자 청소 시작 (Thread)--");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(혼자) " + i + " 번방 청소중 (Thread)");
        }
        System.out.println("-- 혼자 청소 끝 (Thread) --");
    }
}
