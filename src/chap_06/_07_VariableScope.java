package chap_06;

public class _07_VariableScope {
    public static void methodA() {
//        System.out.println(nubmer);
    }

    public static void methodB() {
        int result = 1; // 지역변수
    }

    public static void main(String[] args) {
        int number = 3;
//        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i);


        {
            int j = 0;
            System.out.println(j);
        }
//        System.out.println(j);
    }
}
