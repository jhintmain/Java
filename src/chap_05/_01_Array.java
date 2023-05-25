package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배연선언 #1
        String[] coffees = new String[4];
        coffees[0] = "아메리카노";
        coffees[1] = "아이스라떼";
        coffees[2] = "카푸치노";
        coffees[3] = "카페모카";

        // 배열선언 #2
        String[] coffees2 = new String[] {"아메리카노","아이스라떼","카푸치노","카페모카"};

        // 배열선언 #3
        String[] coffees3 = {"아메리카노","아이스라떼","카푸치노","카페모카"};

        System.out.println("===================================");

        for (int i = 0; i < coffees.length; i++) {
            if(i == 2){
                coffees[i] = "마끼야또";
            }
            System.out.println(coffees[i]+" 하나");
        }

    }
}
