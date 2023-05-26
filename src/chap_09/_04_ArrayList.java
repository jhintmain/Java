package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크  : List , Set , Map
        ArrayList<String> list = new ArrayList<>();

        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("---------- 삭제 (remove) --------------");

        // list 삭제 : remove() index는 앞으로 땡겨짐
        System.out.println("신청학생수 : " + list.size());
        list.remove("박명수"); // 뒤에 index 땡겨짐
//        list.remove(3);
        System.out.println("신청학생수 : " + list.size());
        System.out.println(list.get(3));

        System.out.println("-----------");
        System.out.println("남은 학생수 : " + list.size());
        list.remove(list.size() - 1);
        System.out.println("남은 학생수 : " + list.size());

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("---------- 변경(set) --------------");
        System.out.println(list.get(0));
        list.set(0,"이수근");
        System.out.println(list.get(0));

        System.out.println("---------- 확인 (indexOf, contains)--------------");
        System.out.println(list.indexOf("김종국"));
        if(list.contains("김종국")){
            System.out.println("김종국 포함");
        }else{
            System.out.println("김종국 미포함");
        }

        System.out.println("---------- 삭제 (clear)--------------");
        list.clear();
        if(list.isEmpty()){
            System.out.println("비어있음");
        }else{
            System.out.println("비어있지 않음");
        }

        System.out.println("---------- 정렬 (sort)--------------");
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list);
        for (String name : list) {
            System.out.println(name);
        }
    }
}
