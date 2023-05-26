package chap_09;


import java.util.HashMap;
import java.util.Map;


public class _07_HashMap {
    public static void main(String[] args) {
        // HashMap : key-value 한쌍, 중복X, 순서X
        HashMap<String,Integer> map = new HashMap<>();

        System.out.println("---------- 추가 (put) --------------");
        map.put("유재석",10);
        map.put("박명수",5);
        map.put("김종국",3);

        System.out.println("map size : "+map.size());

        System.out.println("---------- 조회 (get) --------------");
        System.out.println(map.get("유재석"));
        System.out.println(map.get("박명수"));


        System.out.println("---------- 확인 (containsKey, containsValue)--------------");
        if(map.containsKey("유재석")){
            System.out.println("유재석 - key 포함");
        }else{
            System.out.println("유재석 - key 미포함");
        }

        if(map.containsValue(10)){
            System.out.println("10 - val 포함");
        }else{
            System.out.println("10 -  미포함");
        }


        System.out.println("---------- 삭제 (remove) --------------");
        map.remove("김종국");
        System.out.println(map.getOrDefault("김종국",9999));
        printMap(map);


        System.out.println("---------- 삭제 (clear)--------------");
        map.clear();
        if(map.isEmpty()){
            System.out.println("비어있음");
        }else{
            System.out.println("비어있지 않음");
        }

    }

    public static <K,V> void printMap(Map<K,V> map) {
        for(K key : map.keySet()){
            System.out.println(key+","+map.get(key));
        }

        for(V val :map.values()){
            System.out.println(val);
        }

        System.out.println("-----------------------");
        map.forEach((k, v) -> System.out.println(k));
        map.forEach((k, v) -> System.out.println(v));


        System.out.println("------------ END ----------");
    }
}
