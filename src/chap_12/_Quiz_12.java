package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        Runnable runnableA = new ReadyProduct("A");
        Runnable runnableB = new ReadyProduct("B");

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       /* while(threadA.isAlive() || threadB.isAlive()){

        }*/

        Runnable runnableSet = new ReadyProduct("Set");
        Thread threadSet = new Thread(runnableSet);
        threadSet.start();

    }
}

class ReadyProduct implements Runnable {
    private String name;
    public int count = 5;

    public ReadyProduct(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(this.name + " 상품 준비 " + i + "/" + count);
        }
        System.out.println("--" + this.name + " 상품 준비 완료 --");
    }
}
