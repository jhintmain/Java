package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(String number) {
        int num = Integer.parseInt(number);
        return num * num;
    }

    public static void main(String[] args) {
        int num1 = getPower(5);
        int num2 = getPower("3");

        System.out.println(num1);
        System.out.println(num2);

    }
}
