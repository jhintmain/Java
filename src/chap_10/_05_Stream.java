package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 : 흐르는 데이터

        // 1. Arrays.stream()
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langStream = Arrays.stream(langs);

        // 2. Collection.stream()
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        Stream<String> langListStream = langList.stream();

        // 3. Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        // --------------------------------------------------
        // 스트림 사용, 소진되기때문에 사용할때마다 초기화 해줘야함. 원본 데이터는 영향X
        // 중간연산 : filter, map, sorted, distinct, skip
        // 최종연상 : count, min, max, sum, forEach, anyMath, allMath

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        System.out.println("------------------------");
//        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);

        // 90점 이상인 사람수
        int count = (int) Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("------------------------");

        // 90점 이상 점수 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("------------------------");

        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("------------------------");

        // "python", "java", "javascript", "c", "c++", "c#"
        // c로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(lang -> lang.startsWith("c")).forEach(System.out::println);
        System.out.println("------------------------");

        // java를 포함하는 프로그래밍 언어
        Arrays.stream(langs).filter(lang -> lang.contains("java")).forEach(System.out::println);
        System.out.println("------------------------");

        // 4글자이하 언어 정렬해서 출력
        Arrays.stream(langs).filter(lang -> lang.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("------------------------");

        // 4글자 이하 언어중, c 글자를 하나라도 잇는지 여부
        boolean anyMath = Arrays.stream(langs).filter(x -> x.length() <= 4).anyMatch(x -> x.contains("c"));
        System.out.println(anyMath);
        System.out.println("------------------------");

        // 4글자 이하 언어중, c 글자를 모두 포함하는지 여부
        boolean allMath = Arrays.stream(langs).filter(x -> x.length() <= 3).allMatch(x -> x.contains("c"));
        System.out.println(allMath);
        System.out.println("------------------------");

        // 4글자 이하 언어중 c 라는 글자를 포함하는 언어뒹 (어려워요)글자 함께출력
        Arrays.stream(langs)
                .filter(x -> x.length() <= 4)
                .map(x -> x.contains("c") ? x.concat("(어려워요)") : x)
                .forEach(System.out::println);
        System.out.println("------------------------");

        // c라는 글자를 포함하는 언어를 대문자로 변경하여 리스트로 저장
        List<String> langListIncludeC = Arrays.stream(langs)
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        langListIncludeC.stream().forEach(System.out::println);
    }
}
