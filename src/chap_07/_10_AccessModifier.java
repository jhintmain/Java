package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화
        // 정보은닉

        // 접근제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public :  모든 클래스에서 접근 가능
        // default : 같은 패키지내에서만 접근 가능
        // protected : 같은패키지내, 다른패키지의 경우 상속 받은 것만.

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        b1.color = "블랙";

        b1.setPrice(5000);
        System.out.println("가격 : " + b1.getPrice() + "원 ");

        // 고객문의
        System.out.println("해상도 : " + b1.resolution);
        
        
    }
}
