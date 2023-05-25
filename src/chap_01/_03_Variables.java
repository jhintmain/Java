package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "박지혜";
        int hour = 13;
        System.out.println(name + "님 배송이 시작됩니다. " + hour + "시에 방문 예정입니다");
        System.out.println(name + "님 배송이 완료되었습니다");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균점수는" + score + "점 입니다");
        System.out.println("학점은"+grade+"입니다");

        boolean pass = true;
        System.out.println("이번시험 합격 했을까요?"+pass);

        double d= 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

//        int i = 10000000000; // int 범위는 -21억 + 21억
        long l = 10000000000L;
        l =1_000_000_000_000L;
        System.out.println(l);
    }
}
