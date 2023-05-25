package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음);   // true
        System.out.println(김치찌개 && 계란말이 && 제육볶음);   // true

        김치찌개 = false;
        System.out.println(김치찌개 || 계란말이 || 제육볶음);   // true
        System.out.println(김치찌개 && 계란말이 && 제육볶음);   // false

        System.out.println((5 > 3) && (3 > 1));

        // 논리부정
        System.out.println(!true);  // false
        System.out.println(!false); // true
        System.out.println(!(5==5));// false
        System.out.println(!(5!=5));// true
    }
}
