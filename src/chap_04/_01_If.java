package chap_04;

public class _01_If {
    public static void main(String[] args) {
        int hour = 15;

        if (hour > 14)
            System.out.println("아이스 아메리카노 +5");

        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }

        System.out.println("커피주문 완료");

        // switch  :  명확하게 값이 나올때 1/2/3등
        // if : 범위 조건 일때 사용

    }
}
