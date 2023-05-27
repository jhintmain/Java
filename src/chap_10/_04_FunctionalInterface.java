package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();

        // 1. 다형성 미사용
//        converter.convert(1);

        // 2. 다형성 사용
//        convertUSD(converter,2);

        // 3. 람다식 사용
        convertUSD((USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + " 원"), 2);

        // 함수형 인터페이스
        Convertible convertible = (USD) -> System.out.println(USD + "달러 = " + (USD * 1400) + " 원");    // 인터페이스에 1개의 추상메소드만 있을때만 가능.
        convertUSD(convertible, 1);

        // 전달값이 없다면?
        ConvertibleWithNoParams convertibleWithNoParams = () -> System.out.println("1달러는 1400원");
        convertibleWithNoParams.convert();

        // 두줄이상 코드가 있다면
        convertibleWithNoParams = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러 = " + (USD * KRW) + " 원");
        };
        convertibleWithNoParams.convert();

        // 전달값이 2개인 경우
        ConvertibleWithTwoParams convertibleWithTwoParams = (USD, KRW) -> System.out.println(USD + "달러 = " + (USD * KRW) + " 원");
        convertibleWithTwoParams.convert(4, 1400);

        // 리턴값이 존재하는 경우
        ConvertibleWithReturn convertibleWithReturn = (USD, KRW) -> USD * KRW;
        int result = convertibleWithReturn.convert(6, 1400);
        System.out.println("6달러는 " + result);


    }

    public static void convertUSD(Convertible converter, int USD) {
        converter.convert(USD);

    }
}