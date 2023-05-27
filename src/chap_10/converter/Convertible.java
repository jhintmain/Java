package chap_10.converter;


// @FunctionalInterface : 함수형 interface로만 쓰겟다는 어노테이션
@FunctionalInterface
public interface Convertible {

    void convert(int USD);
}
