package chap_09.coffee;

public class CoffeeByNumber {
    public int waitingNumber;

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready(){
        System.out.println("커피 준비완료 : "+waitingNumber);
    }
}
