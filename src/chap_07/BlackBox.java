package chap_07;

public class BlackBox {
    String modelName;   // 모델명
    String resolution;   // 해상도
    int price;  // 가격
    String color;    // 색상
    int serialNumber; // 시리얼 번호

    static int counter =0 ;
    // 클래스 변수 > 생성되는 모든 객체에 공통으로 적용된다
    static boolean canAutoReport = false;   //  자동신고기능

    BlackBox(){
        System.out.println("기본 생성자호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 너머를 발급 받았습니다 : "+ this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color){

        this(); // 기본생성자 호출

        System.out.println("사용자 정의 생성자호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    void autoReport(){
        if(canAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다");
        }
    }

    void record(boolean showDataTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다");
        if(showDataTime){
            System.out.println("영상에 날짜정보가표시됩니다");
        }
        if(showSpeed){
            System.out.println("영상에 속도정보가 표시됩니다");
        }
        System.out.println("영상은 "+min+" 분 단위로 기록됩니다");
    }
    void record(){
        record(true, true, 5);
    }

    // 클래스 메소드
    // static을 붙이면 클래스 메소드 모든 객체 공통 적용
    // static은 static만 호출 가능 instance 메소드/변수 사용못함
    static void callServiceCenter(){
        System.out.println("서비스센터(1588-0000)로 연결 합니다.");
//        canAutoReport = false; // static 변수
//        modelName = "TEST"; // instance 변수
    }

    void appendModelName(String modelName) {
        this.modelName = modelName;
    }

    // Getter & Setter

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
