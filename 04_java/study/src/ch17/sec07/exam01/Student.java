package ch17.sec07.exam01;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int compareTo(Student o) {
        //점수를 기준으로 오름차순 정렬
        return Integer.compare(score, o.score);
    }
}
