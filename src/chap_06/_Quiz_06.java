package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String str, int maskingIndex){
        String maskingStr = str.substring(0,maskingIndex);
        for (int i = maskingIndex; i < str.length(); i++) {
            maskingStr += "*";
        }
        return maskingStr;
    }
    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 :\t"+getHiddenData(name,1));
        System.out.println("주민등록번호 :\t"+getHiddenData(id,8));
        System.out.println("전화번호 :\t"+getHiddenData(phone,9));

    }
}
