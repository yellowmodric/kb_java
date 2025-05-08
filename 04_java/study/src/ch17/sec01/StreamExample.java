package ch17.sec01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        //Stream 이용해서 요소를 하나씩 출력
        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));
    }
}
