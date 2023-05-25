package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        // String.equals() : 문자열 비교(대소문자 구분)
        System.out.println(s1.equals(s2));  // false
        System.out.println(s1.equals("Java"));  // true
        System.out.println(s2.equals("python"));    // false

        // String.equalsIgnoreCase() : 문자열 비교 (대소문자 구분 X)
        System.out.println(s2.equalsIgnoreCase("python"));

        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2));// true (내용)
        System.out.println(s1 == s2);// ture (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1 == s2);   // false  > why??  주소를 비교하기때문

    }
}
