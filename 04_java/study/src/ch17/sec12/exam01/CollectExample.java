package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        List<Student> maleList = totalList.stream()
                .filter(s -> s.getSex().equals("남"))
                .toList();

        maleList//stream()
                .forEach(s -> System.out.println(s.getName()));
        //굳이 스트림으로 안바꿔도 됨
        maleList.forEach(System.out::println);

        System.out.println();

        maleList.stream()
                .map(Student :: getName)
                .forEach(System.out::println);

        //선언적 프로그래밍
        List<Student> topList = totalList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                //limit로 상위 두 개만 지정 가능
                .limit(2).
                //스트림을 다시 리스트로 바꿔주는 메소드
                toList();

        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                s -> s.getName(),
                                s -> s.getScore()
                        )
                );
        System.out.println(map);
    }
}
