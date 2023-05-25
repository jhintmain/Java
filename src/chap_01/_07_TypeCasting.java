package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수 <-> 실수

        // int -> float , double
        int score = 93;
        System.out.println(score);      // 93
        System.out.println((float) score);  // 93.0
        System.out.println((double) score); // 93.0


        // float , double -> int
        float score_f = 93.3F;
        double score_d = 93.3;
        System.out.println((int)score_f);   // 93
        System.out.println((int)score_d);   // 93

        // 정수형 = 정수 + 실수 > 선언필요
        score = 93 +(int) 98.8;
        System.out.println(score);

        // 실수형 = 정수 + 실수 > 자동형변환
        score_d = (double)93 + 98.8;
        score_d = 93 + 98.8;
        System.out.println(score_d);

        double convertedScoreDouble = score;  // 191 -> 191.0
        // int -> long -> float -> double (자동형변환)

        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동형변환)

        // 숫자를 문자열로 (String 클래스나 Integer 클래스 이용)
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로 ( 숫자클래스 이용)
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

//        int err = Integer.parseInt("자바"); // error 남
//        System.out.println(err);




    }
}
