package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권");
        list.add("신민철");

        list.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        //위의 코드들을 합쳐서 한번에 처리
        list.stream()
                .distinct()
                .filter(n -> n.startsWith("신"))
                .forEach(System.out::println);
    }
}
