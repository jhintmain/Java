package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }

        if(args.length == 1){
            String div = args[0];
            switch (div){
                case "1" :
                    System.out.println("도서 조회 메뉴입니다");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴입니다");
                    break;
                case "3" :
                    System.out.println("도서 반납 메뉴입니다.");
            }
        }else{
            System.out.println("사용법 ) 1~3 메뉴중 하나를 입력하세요");
        }

    }
}
