package chap_10;

public class _01_AnonymousClass {
    public static void main(String[] args) {

        Coffee coffee = new Coffee();
        coffee.order("아메리카노");
        System.out.println("-----------------");
        Coffee coffee1 = new Coffee();
        coffee1.order("라떼");
        System.out.println("-----------------");
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 딸기 케이크는 서비스에요");
            }

            @Override
            public void returnTray() {
                System.out.println("(귓속말) 자리에 두시면 제가 치울께요");

            }
        };

        specialCoffee.order("바닐라 라떼");
        System.out.println("-----------------");
    }
}

class Coffee {

    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + "나왔습니다");
    }

    public void returnTray(){
        System.out.println("커피반납이 완료 되었습니다");
    }

}