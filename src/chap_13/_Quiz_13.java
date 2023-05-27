package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        File file = new File("saying.txt");
        Scanner sc = new Scanner(System.in);

        System.out.println("속담 퀴즈 입니다. 빈간에 알맞은 말을 입력하시오(주관식)");
        System.out.println("--------------------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null){

                System.out.println("(문제)" +line);
                System.out.print(" 정답 입력 => ");

                String answer = sc.nextLine();
                String nextLine = br.readLine();

                if(answer.equals(nextLine)){
                    System.out.println("정답입니다!!!");
                }else{
                    System.out.println("틀렸습니다. 정답은 "+nextLine+"입니다");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("모든 퀴즈가 완료되었습니다.");
        System.out.println("수고하셨습니다.^^.");


    }
}
