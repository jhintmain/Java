package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /*
        System.out.print("이름 : ");
        String name = sc.next();

        System.out.print("혈액형 : ");
        String bloodType = sc.next();

        System.out.print("키 : ");
        int height = sc.nextInt();

        System.out.print("몸무게 : ");
        double weight = sc.nextDouble();


        System.out.println("-------------");
        System.out.println("이름 : " + name);
        System.out.println("혈액형 : " + bloodType);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);*/


        // next() : 띄어쓰기 기준으로
        // nextLine() : 줄 기준

        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        String lang = sc.next();    // 한단어
        System.out.println("언어 : " + lang);

        // sc.nextLine();   // scanner 변수가 담겨있는 불필요문장 삭제

        System.out.println("배우고 나니 기분이 어떤가요?");
        String feeling = sc.nextLine();
        System.out.println("기분 : " + feeling);


    }
}
