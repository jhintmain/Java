package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체지향 프로그래밍 ( OOP : Object-Oriented Programing )
        // 유지보수 용이
        // 높은 재사용성

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상

//        String modelName = "까망이";
//        String resolution = "FHD";
//        int price = 200000;
//        String color = "블랙";
//
//        String modelName2 = "하양이";
//        String resolution2 = "UHD";
//        int price2 = 300000;
//        String color2 = "화이트";

        // BlackBox 객체생성
        // bbox 는 BlackBox의 인스턴스
        BlackBox bbox1 = new BlackBox();
        bbox1.modelName =  "까망이";
        bbox1.resolution =  "FHD";
        bbox1.price =  200000;
        bbox1.color =  "블랙";

        System.out.println(bbox1.modelName);
        System.out.println(bbox1.resolution);
        System.out.println(bbox1.price);
        System.out.println(bbox1.color);

        System.out.println("===================");

        BlackBox bbox2 = new BlackBox();
        bbox2.modelName =  "하양이";
        bbox2.resolution =  "UHD";
        bbox2.price =  300000;
        bbox2.color =  "화이트";

        System.out.println(bbox2.modelName);
        System.out.println(bbox2.resolution);
        System.out.println(bbox2.price);
        System.out.println(bbox2.color);






    }
}
