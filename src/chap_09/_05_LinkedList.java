package chap_09;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        System.out.println("---------- 데이터 조회 (get , getFirst, getLast) --------------");
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("---------- 추가 (add, addFirst, addLast) --------------");
        list.add("코난");

        printList(list);

        list.addFirst("서장훈");
        printList(list);

        list.addLast("김희철");
        printList(list);

        list.add(2,"김영철");
        printList(list);


        System.out.println("---------- 삭제 (remove. removeFirst, removeLast) --------------");
        list.remove(2);
        printList(list);

        list.removeFirst();
        printList(list);

        list.removeLast();
        printList(list);

        System.out.println("---------- 변경 (set) --------------");
        list.set(0,"라이언");
        printList(list);

        System.out.println("---------- 확인 (indexOf, contains)--------------");
        System.out.println(list.indexOf("라이언"));
        if(list.contains("라이언")){
            System.out.println("라이언 포함");
        }else{
            System.out.println("라이언 미포함");
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
        printList(list);
    }

    public static <T> void printList(List<T> list){
        for (T name : list) {
            System.out.println(name);
        }
        System.out.println("------------ END ----------");
    }
}
