package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"아메리카노","라떼","모카","카푸치노"};

        // 향상된 for문 = for-each
        for (String coffee : coffees) {
            System.out.println(coffee);
        }
    }
}
