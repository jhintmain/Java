package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항연산자
        // 결과 = 조건 ? 참일때 : 거짓일때

        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;  // max = x
        System.out.println(max);

        max = (x > y) ? y : x;  // max = y
        System.out.println(max);
    }
}
