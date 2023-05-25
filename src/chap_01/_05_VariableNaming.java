package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수이름 짓는법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄,문자,숫자만 사용 ( 공백 X )
        // 3. 밑줄 or 문자로만 시작가능  (숫자 안됨)
        // 4. 한단어이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫단어 제외)
        // 6. 예약어 사용 불가

        // 절대 변하지 않는 상수는 대문자!!
        final String CODE = "KR";

        String nationality = "대한민국";
        String firstName = "지혜";
        String lastName = "박";
        String dateOfBirth = "2003-11-19";
        String residentialAddress = "무슨 호텔";
        String purposeOfVisit = "관광";
        String flightNo = "KE899";
        String _flightNo = "KE899";
        String flight_no = "KE899";

        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "시계";
        String item2 = "가방";

        int i = 0;
        String s = "";
        String str = "";

    }
}
