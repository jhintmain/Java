package chap_13;

public class _02_OutPut {
    public static void main(String[] args) {
//        System.out.format();
//        System.out.printf("포멧", 값,값,값,);

        System.out.println("------- 정수 --------");
        System.out.printf("%d%n",1);
        System.out.printf("%d %d %d%n",1,2,3);
        System.out.printf("%d%n",1234);
        System.out.printf("%6d%n",1234);    // 6자리 공간확보하고 __1234
        System.out.printf("%06d%n",1234);   // 6자리 공간확보하고, 빈공간 0으로 채움 001234
        System.out.printf("%6d%n",-1234);   // 6자리 공간확보하고, 빈공간 0으로 채움 _-1234
        System.out.printf("%+6d%n",1234);   // 6자리 공간확보하고, 부호 붇임 _+1234
        System.out.printf("%-6d%n",1234);   // 6자리 공간오른쪽 정렬로 확보 하고, 1234__
        System.out.printf("%,6d%n",1234);   // 6자리 공간확보하고, _1,

        System.out.println("이름       영어  수학   평균");
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호",90,80,85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅",100,100,100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수",95,100,97.5);


    }
}
