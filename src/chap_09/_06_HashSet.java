package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _06_HashSet {
    public static void main(String[] args) {
        // HashSet : 순서x, 중복x
        // LinkedHashSet : 순서o, 중복x
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("소금");
        set.add("후추");
        set.add("깻잎");
        set.add("삼겹살");
        set.add("삼겹살");

        System.out.println("Set size : "+set.size());
        printSet(set);

        System.out.println("---------- 삭제 (remove) --------------");
        set.remove("삼겹살");
        printSet(set);

        System.out.println("---------- 확인 (contains)--------------");
        if(set.contains("삽겹살")){
            System.out.println("삽겹살 포함");
        }else{
            System.out.println("삽겹살 미포함");
        }

        System.out.println("---------- 추가 (add) --------------");
        set.add("삼겹살");
        set.add("마늘");
        printSet(set);

        System.out.println("---------- 삭제 (clear)--------------");
        set.clear();
        if(set.isEmpty()){
            System.out.println("비어있음");
        }else{
            System.out.println("비어있지 않음");
        }


        System.out.println("Linked HashSet");
        HashSet<Integer> intSet = new LinkedHashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);
        printSet(intSet);
    }

    public static <T> void printSet(Set<T> set) {
        for (T name : set) {
            System.out.println(name);
        }
        System.out.println("------------ END ----------");
    }
}
