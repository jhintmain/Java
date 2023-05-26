package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");


        Iterator<String> it;
        printIterator(list);


        it = list.iterator();   // 커서 맨앞으로 이동
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("알 수 없음")) {
                it.remove();    // 삭제
            }
        }

        printIterator(list);

        HashSet<String> set = new HashSet<>();
        set.add("구피");
        set.add("새우");
        set.add("기포기");
        set.add("수초");
        set.add("히터");

        printIterator(set);

        HashMap<String,Integer> map = new HashMap<>();
        map.put("얼그레이",1);
        map.put("블랙퍼스트",2);
        map.put("레이디 그레이",3);
        map.put("문 차일드",4);

        // ******************************************
        printIterator(map.keySet());
        printIterator(map.values());
        printIterator(map.entrySet());
        // ******************************************


    }

    public static <T> void printIterator(Iterable<T> loop) {
        Iterator<T> it = loop.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------------------");
    }
}
