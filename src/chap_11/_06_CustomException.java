package chap_11;

public class _06_CustomException {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 19) {
//                System.out.println("만 19세 미만");
                throw new UserException("만 19세 미만");
            } else {
                System.out.println("주문하신 상품 여기있습니다");
            }
        } catch (UserException e) {
            System.out.println(e.getMessage());
            System.out.println("더 크고 오세요");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}
