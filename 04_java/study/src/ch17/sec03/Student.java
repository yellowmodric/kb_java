package ch17.sec03;

public class Student {
    private String name;
    private int age;

    public Student(String name, int score) {
        this.name = name;
        this.age = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return age;
    }
}
