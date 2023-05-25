package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        String bus = "1234";
        int leftTime = 3;
        float leftDistance = 1.5F;

        System.out.println(bus+"번 버스");
        System.out.println("약 "+leftTime+"분 후 도착");
        System.out.println("남은 거리 "+leftDistance+"km");

        bus = "상암08";
        leftTime = 5;
        leftDistance = 1.8F;

        System.out.println(bus+"번 버스");
        System.out.println("약 "+leftTime+"분 후 도착");
        System.out.println("남은 거리 "+leftDistance+"km");
    }
}
