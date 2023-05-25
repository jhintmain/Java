package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int cost = 4000;
        float discount = 0.5F;
        int max_cost = 30000;

        int time = 5;
        int pay_money = time * cost;
        String div = "일반 차량";


        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                time = 5;
                div = "경차";
            } else if (i == 2) {
                time = 10;
                div = "장애인 차량";
            }
            pay_money = time * cost;
            pay_money = pay_money > max_cost ? max_cost : pay_money;

            switch (div) {
                case "경차":
                case "장애인 차량":
                    pay_money *= discount;
            }
            System.out.println("주차 요금은 " + pay_money + " 원 입니다.");

        }


    }
}
