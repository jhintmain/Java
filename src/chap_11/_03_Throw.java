package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        int age = 17;

        try {
            if (age < 19) {
                throw new Exception("만 19세 미만에게는 판매하지 않습니다");
            } else {
                System.out.println("주문하신 상품 여기 있습니다");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("무조건 실행되는 부분입니다1");
        }

        System.out.println("무조건 실행되는 부분입니다2");
    }
}
