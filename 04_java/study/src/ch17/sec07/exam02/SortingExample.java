package ch17.sec07.exam02;

import ch17.sec07.exam01.Student;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<ch17.sec07.exam01.Student> studentList = new ArrayList<ch17.sec07.exam01.Student>();
        studentList.add(new ch17.sec07.exam01.Student("홍길동", 30));
        studentList.add(new ch17.sec07.exam01.Student("신용권", 10));
        studentList.add(new Student("유미선", 20));

        studentList.stream()
                //점수를 기준으로 오름차순 정렬(낮은 점수 -> 높은 점수)
                .sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
        System.out.println();

        studentList.stream()
                .sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}
