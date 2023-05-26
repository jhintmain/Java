package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());       // int의 범위내에서 정수형 값 변환
        System.out.println(random.nextInt(10)); // 0~9
        System.out.println(random.nextDouble());    // 0.0이상 1.0 미만 실수값
        System.out.println(random.nextBoolean());

        System.out.println(random.nextInt(45)+1);   // 1~45까지

        // 자바 유용한 패키지..
        // Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        // BigInteger, BigDecimal
        // LocalDate, LocalTime, LocalDateTime, DateTimeFormatter

    }
}
