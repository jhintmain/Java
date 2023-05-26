package chap_07.camera;

// 클래스 final =  상속 불가
public final class ActionCam extends Camera{
//    public final String lens = "광각렌즈";
    public final String lens;
    public ActionCam(){
        super("액션 카메라");
        lens = "광각렌즈";  // finale은 생성자에서 초기화 가능하다
    }

    // 메소드 final = 오버 라이딩 불가
    public final void makeVideo(){
        System.out.println(this.name+" : "+this.lens+" 로 촬영한 멋진 비디오를 제작합니다");
    }
}
