package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // String.replace(old, new) : 문자열 변환
        System.out.println(s.replace(" and", ","));  // I like Java, Python, C.

        // String.substring(start_idx, end_idx) : 문자열 자르기(기존문자에 영향X)
        System.out.println(s.substring(7)); // Java and Python and C.
        System.out.println(s.substring(7, s.indexOf("."))); // Java and Python and C.

        // String.trim() : 공백제거
        s = "         I Love Java.    ";
        System.out.println(s);
        System.out.println(s.trim());

        // String.concat() : 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);    // JavaPython
        System.out.println(s1 + "," + s2);  // Java,Python
        System.out.println(s1.concat(",").concat(s2));  // Java,Python
    }
}
