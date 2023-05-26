package chap_07;

public class _Quiz_07 {
    public static void main(String[] args) {
        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("----------------");

        Burger[] burgers = new Burger[3];
        burgers[0] = new Burger();
        burgers[1] = new CheeseBurger();
        burgers[2] = new ShripBurger();

        for (Burger buger : burgers
        ) {
            buger.cook();
            System.out.println("----------");
        }

        System.out.println("메뉴 준비가 완료되었습니다");
    }
}


class Burger {
    String name;

    Burger() {
        this("햄버거");
    }

    Burger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");

        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

class CheeseBurger extends Burger {
    CheeseBurger() {
        super("치즈버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }

}

class ShripBurger extends Burger {
    ShripBurger() {
        super("새우버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}