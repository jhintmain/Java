package chap_08.detector;

public class FireDetector implements Detectable{
    @Override
    public void detect() {
        System.out.println("일반 성능으로 화제를 감지합니다");
    }
}
