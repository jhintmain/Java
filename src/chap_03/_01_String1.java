package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // String.length() : 문자열 길이
        System.out.println(s.length());

        // String.toUpperCase(), String.toLowerCase() : 대소문자 변환
        System.out.println(s.toUpperCase());    // 대문자로
        System.out.println(s.toLowerCase());    // 소문자로

        // String.contains()  : 포함 관계(true/false)
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#")); // false

        // String.indexOf() : 위치정보(index/-1)
        // String.lastIndexOf() : 뒤에서부터 위치정보(index/-1)
        System.out.println(s.indexOf("Java"));  // 7
        System.out.println(s.indexOf("C#"));  // -1
        System.out.println(s.indexOf("and"));  // 12
        System.out.println(s.lastIndexOf("and"));  // 23

        // String.startsWith() , String.endsWith() : 시작/ 종료 문구 확인(true/false)
        System.out.println(s.startsWith("I like")); // 이문자열로 시작하면 true
        System.out.println(s.endsWith(".")); // 이문자열로 끝나면 true

    }
}
