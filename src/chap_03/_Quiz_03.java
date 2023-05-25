package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String jumin = "960102-1234567";
        System.out.println(jumin.substring(0,8));
        System.out.println(jumin.substring(0,jumin.indexOf("-")+2));

    }
}
