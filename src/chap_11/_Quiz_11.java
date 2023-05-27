package chap_11;

import java.util.Random;

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 2;
        try {
            switch (errorCode) {
                case 0:
                    System.out.println("(상품 구매를 완료하였습니다)");
                    break;
                case 1:
                    throw new EnableTimeException("상품 구매 가능 시간이 아닙니다");
                case 2:
                    throw new SoldOutException("해당 상품은 매진 되었습니다");
            }
        } catch (EnableTimeException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시 부터 가능합니다");
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음기회에 이용해주세요");
        }

    }
}


// 상품 구매 가능 시간 Exception
class EnableTimeException extends Exception {
    public EnableTimeException(String message) {
        super(message);
    }
}

// 상품매진 Exception
class SoldOutException extends Exception {
    public SoldOutException(String message) {
        super(message);
    }
}
