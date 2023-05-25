package chap_06;

public class _01_Method {
    public static void sayHello(){
        System.out.println("안녕하세요? 메소드 입니다");
    }

    public static void power(int number){
        int result = number * number;
        System.out.println(number+"의 2승은 "+result);
    }

    public static void powerByExp(int number, int exponent){
        int result =1;
        for (int i = 0; i < exponent ; i++) {
            result *= number;
        }
        System.out.println(number+"의 "+exponent+" 승은 "+result);
    }
    public static void main(String[] args) {
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");

        power(2);
        power(5);
        power(10);

        powerByExp(2,3);
        powerByExp(5,2);
        powerByExp(10,3);
    }
}
