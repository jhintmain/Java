package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료 : 빵, 소고기패티, 해시브라운, 양상추");
            }
        };
        momMadeBurger.cook();


        HomeMadeBurger broMaeBurger = getBroMadeBurger();
        broMaeBurger.cook();
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 수제버거");
                System.out.println("재료 : 빵, 치친패티, 삶은달걀, 양상추");
            }
        };
    }
}

abstract class HomeMadeBurger {
    public abstract void cook();
}
